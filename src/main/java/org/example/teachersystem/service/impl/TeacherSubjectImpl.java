package org.example.teachersystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.teachersystem.dto.TeacherSubjectDTO;
import org.example.teachersystem.service.TeacherSubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherSubjectImpl implements TeacherSubjectService {
    @Override
    public TeacherSubjectDTO saveTeacherSubject(TeacherSubjectDTO teacherSubjectDTO) {
        return null;
    }

    @Override
    public TeacherSubjectDTO updateTeacherSubject(TeacherSubjectDTO teacherSubjectDTO) {
        return null;
    }

    @Override
    public List<TeacherSubjectDTO> getAllTeacherSubjects() {
        return List.of();
    }

    @Override
    public void deleteTeacherSubject(int teacherSubjectId) {

    }

    @Override
    public List<TeacherSubjectDTO> getSubjectsByTeacher(int teacherId) {
        return List.of();
    }
}
