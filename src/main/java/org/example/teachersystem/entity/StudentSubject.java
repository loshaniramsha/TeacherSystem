package org.example.teachersystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_subject")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subject;

    private String academyYear;


}
