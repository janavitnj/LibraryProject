package com.shivam.library.request.models;

import com.shivam.library.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentRequest {
    private Student student;
    private Long authorId;

    @Override
    public String toString() {
        return "AppointmentRequest [student=" + student + ", authorId=" + authorId + "]";
    }

}
