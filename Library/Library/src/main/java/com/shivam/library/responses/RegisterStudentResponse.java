package com.shivam.library.responses;

import org.springframework.http.HttpStatus;

import com.shivam.library.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterStudentResponse {
    private HttpStatus status;
    private String message;
    private Student student;
}
