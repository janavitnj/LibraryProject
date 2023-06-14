package com.shivam.library.repository;

import com.shivam.library.model.Student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Optional<Student> getStudentByEmail(String email);
}
