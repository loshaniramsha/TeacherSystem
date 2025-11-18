package org.example.teachersystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.teachersystem.dto.StudentSubjectDTO;
import org.example.teachersystem.service.StudentSubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentSubjectServiceImpl implements StudentSubjectService {
    @Override
    public StudentSubjectDTO saveStudentSubject(StudentSubjectDTO studentSubjectDTO) {
        return null;
    }

    @Override
    public StudentSubjectDTO updateStudentSubject(StudentSubjectDTO studentSubjectDTO) {
        return null;
    }

    @Override
    public List<StudentSubjectDTO> getAllStudentSubjects() {
        return List.of();
    }

    @Override
    public void deleteStudentSubject(int studentSubjectId) {

    }

    @Override
    public List<StudentSubjectDTO> getSubjectsByStudent(int studentId) {
        return List.of();
    }
}
