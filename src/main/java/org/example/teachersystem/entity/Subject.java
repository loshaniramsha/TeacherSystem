package org.example.teachersystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "subject")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Subject {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int subjectId;
   private String subjectName;

}
