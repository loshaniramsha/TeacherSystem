package org.example.teachersystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "marks")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_subject_id")
    private StudentSubject studentSubject;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

}
