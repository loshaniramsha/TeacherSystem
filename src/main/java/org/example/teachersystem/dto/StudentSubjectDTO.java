package org.example.teachersystem.dto;

import lombok.Data;

@Data
public class StudentSubjectDTO {
    private int id;
    private int subjectId;
    private int studentId;
    private String academicYear;
}
