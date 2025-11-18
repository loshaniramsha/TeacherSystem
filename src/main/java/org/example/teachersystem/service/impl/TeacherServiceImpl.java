package org.example.teachersystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.teachersystem.dto.TeacherDTO;
import org.example.teachersystem.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    @Override
    public TeacherDTO saveTeacher(TeacherDTO dto) {
        return null;
    }

    @Override
    public TeacherDTO updateTeacher(TeacherDTO dto) {
        return null;
    }

    @Override
    public void deleteTeacher(int id) {

    }

    @Override
    public TeacherDTO getTeacherById(int id) {
        return null;
    }

    @Override
    public List<TeacherDTO> getAllTeachers() {
        return List.of();
    }
}
