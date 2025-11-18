package org.example.teachersystem.service;

import org.example.teachersystem.dto.TeacherSubjectDTO;

import java.util.List;

public interface TeacherSubjectService {
    TeacherSubjectDTO saveTeacherSubject(TeacherSubjectDTO teacherSubjectDTO);
    TeacherSubjectDTO updateTeacherSubject(TeacherSubjectDTO teacherSubjectDTO);
    List<TeacherSubjectDTO> getAllTeacherSubjects();
    void deleteTeacherSubject(int teacherSubjectId);
    List<TeacherSubjectDTO> getSubjectsByTeacher(int teacherId);
}
