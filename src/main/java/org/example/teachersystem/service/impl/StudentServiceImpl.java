package org.example.teachersystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.teachersystem.dto.StudentDTO;
import org.example.teachersystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    @Override
    public StudentDTO saveStudent(StudentDTO dto) {
        return null;
    }

    @Override
    public StudentDTO updateStudent(StudentDTO dto) {
        return null;
    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public StudentDTO getStudentById(int id) {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return List.of();
    }
}
