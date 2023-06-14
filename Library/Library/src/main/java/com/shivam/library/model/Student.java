package com.shivam.library.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String appointmentDate;
    private String email;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "student_author", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    @JsonBackReference
    private List<Author> authors;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", appointmentDate=" + appointmentDate + ", email=" + email
                + ", authors=" + authors + "]";
    }
}
