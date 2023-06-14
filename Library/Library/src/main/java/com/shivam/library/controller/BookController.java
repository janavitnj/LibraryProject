package com.shivam.library.controller;

import com.shivam.library.model.Book;
import com.shivam.library.responses.AddBookResponse;
import com.shivam.library.service.BookService;
import com.shivam.library.service.PlagiarismFound;

import ch.qos.logback.core.encoder.EchoEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books") // mapping for GET request
    public List<Book> getAllDepartments() {

        return bookService.getBooksList();
    }

    // mapping for POST request
    @PostMapping("/books")
    public AddBookResponse createBook(@RequestBody Book book) throws PlagiarismFound {

        if (bookService.createBook(book))
            return new AddBookResponse(HttpStatus.ACCEPTED, "Book approved");
        else {
            return new AddBookResponse(HttpStatus.ACCEPTED, "Book added without approval");
        }
    }

    @GetMapping("/books/id/{id}")
    public List<Book> getBookByAuthorId(@PathVariable("id") Long authorId) {
        return bookService.getBooksListByAuthorId(authorId);
    }
}