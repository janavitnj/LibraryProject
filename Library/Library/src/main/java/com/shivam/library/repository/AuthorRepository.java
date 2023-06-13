package com.shivam.library.repository;

import com.shivam.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    public Author getAuthorByEmail(String email);
}
