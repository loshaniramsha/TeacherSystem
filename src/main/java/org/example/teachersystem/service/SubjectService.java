package org.example.teachersystem.service;

import org.example.teachersystem.dto.SubjectDTO;

import java.util.List;

public interface SubjectService {
    SubjectDTO saveSubject(SubjectDTO subjectDTO);
    SubjectDTO updateSubject(SubjectDTO subjectDTO);
    List<SubjectDTO> getAllSubjects();
    void deleteSubject(int subjectId);
    SubjectDTO getSubjectById(int subjectId);
}
