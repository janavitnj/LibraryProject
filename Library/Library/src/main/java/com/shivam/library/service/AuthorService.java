package com.shivam.library.service;

import com.shivam.library.exception.ResourceNotFoundException;
import com.shivam.library.model.Author;
import com.shivam.library.model.Book;
import com.shivam.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AuthorService implements AuthorServiceImpl {
    @Autowired
    private AuthorRepository depRepo;
    @Override
    public Author createAuthor(Author book) {
        return depRepo.save(book);
    }

    @Override
    public Author saveAuthor(Author book) {
        return null;
    }

    @Override
    public List<Author> getAuthorsList() {
        return  depRepo.findAll();
    }

    @Override
    public Author getAuthorById(Long bookId) {
        return depRepo.findById(bookId).get();
    }





}
