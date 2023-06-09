package com.shivam.library.repository;

import com.shivam.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    public List<Book> getBooksListByAuthorId(Long authorId);
}
