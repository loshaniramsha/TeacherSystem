package org.example.teachersystem.service;

import org.example.teachersystem.dto.StudentDTO;
import org.example.teachersystem.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    TeacherDTO saveTeacher(TeacherDTO dto);
    TeacherDTO updateTeacher(TeacherDTO dto);
    void deleteTeacher(int id);
    TeacherDTO getTeacherById(int id);
    List<TeacherDTO> getAllTeachers();
}
