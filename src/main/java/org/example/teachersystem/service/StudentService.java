package org.example.teachersystem.service;

import org.example.teachersystem.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO saveStudent(StudentDTO dto);
    StudentDTO updateStudent(StudentDTO dto);
    void deleteStudent(int id);
    StudentDTO getStudentById(int id);
    List<StudentDTO> getAllStudents();
}
