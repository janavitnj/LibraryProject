package com.shivam.library.service;

import com.shivam.library.model.Author;
import com.shivam.library.request.models.LoginRequest;
import com.shivam.library.responses.LoginResponse;

import java.util.List;

public interface AuthorServiceImpl {
    public Author createAuthor(Author book);

    public Author saveAuthor(Author book);

    public List<Author> getAuthorsList();

    public Author getAuthorById(Long bookId);

    public LoginResponse getAuthorByEmail(LoginRequest request);
}
