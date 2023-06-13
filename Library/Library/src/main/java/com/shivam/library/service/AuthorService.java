package com.shivam.library.service;

import com.shivam.library.exception.ResourceNotFoundException;
import com.shivam.library.model.Author;
import com.shivam.library.model.Book;
import com.shivam.library.repository.AuthorRepository;
import com.shivam.library.request.models.LoginRequest;
import com.shivam.library.responses.LoginResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return depRepo.findAll();
    }

    public Author getAuthorById(Long bookId) {
        return depRepo.findById(bookId).get();
    }

    public LoginResponse getAuthorByEmail(LoginRequest request) {

        Author author = depRepo.getAuthorByEmail(request.email);
        if (!(author.getPassword()).equals(request.password)) {
            return new LoginResponse(HttpStatus.NOT_FOUND, "Invalid Credentails", null);
        }
        return new LoginResponse(HttpStatus.ACCEPTED, "Success", author.getAuthorId());
    }

}
