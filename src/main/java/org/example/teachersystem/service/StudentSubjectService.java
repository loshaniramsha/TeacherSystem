package org.example.teachersystem.service;

import org.example.teachersystem.dto.StudentSubjectDTO;

import java.util.List;

public interface StudentSubjectService {
    StudentSubjectDTO saveStudentSubject(StudentSubjectDTO studentSubjectDTO);
    StudentSubjectDTO updateStudentSubject(StudentSubjectDTO studentSubjectDTO);
    List<StudentSubjectDTO> getAllStudentSubjects();
    void deleteStudentSubject(int studentSubjectId);
    List<StudentSubjectDTO> getSubjectsByStudent(int studentId);
}
