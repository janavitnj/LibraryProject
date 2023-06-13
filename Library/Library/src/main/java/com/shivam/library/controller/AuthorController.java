package com.shivam.library.controller;

import com.shivam.library.model.Author;
import com.shivam.library.model.Book;
import com.shivam.library.request.models.LoginRequest;
import com.shivam.library.responses.LoginResponse;
import com.shivam.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AuthorController {
    @Autowired
    private AuthorService bookService;

    @GetMapping("/author") // mapping for GET request
    public List<Author> getAllBooks() {

        return bookService.getAuthorsList();
    }

    // mapping for POST request
    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author book) {
        return bookService.createAuthor(book);
    }

    @GetMapping("/author/id/{id}")
    public Author getAuthorById(@PathVariable("id") Long authorId) {
        return bookService.getAuthorById(authorId);
    }

    @PostMapping("/author/login")
    public LoginResponse getAuthorByEmail(@RequestBody LoginRequest request) {
        return bookService.getAuthorByEmail(request);
    }
}
