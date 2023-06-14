package com.shivam.library.controller;

import com.shivam.library.model.Student;
import com.shivam.library.responses.AppointmentResponse;
import com.shivam.library.responses.RegisterStudentResponse;
import com.shivam.library.service.StudentService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public RegisterStudentResponse addStudent(@RequestBody Student student) {
        Student newStudent = studentService.addStudent(student);
        return new RegisterStudentResponse(HttpStatus.ACCEPTED, "Success", newStudent);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Student studentDetails) {
        studentService.updateStudent(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
    }

    @PostMapping("/{studentId}/authors/{authorId}/add")
    public AppointmentResponse addAuthorToStudent(
            @PathVariable("authorId") Long authorId,
            @PathVariable("studentId") Long studentId) {
        studentService.addAuthorToStudent(authorId, studentId);
        return new AppointmentResponse(HttpStatus.ACCEPTED, "Student added to author successfully");
    }

    @PostMapping("/{studentId}/authors/{authorId}/remove")
    public String removeAuthorFromStudent(
            @PathVariable("authorId") Long authorId,
            @PathVariable("studentId") Long studentId) {
        studentService.removeAuthorFromStudent(authorId, studentId);
        return "Student removed from author successfully";
    }
}
