package org.example.teachersystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.teachersystem.dto.SubjectDTO;
import org.example.teachersystem.service.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    @Override
    public SubjectDTO saveSubject(SubjectDTO subjectDTO) {
        return null;
    }

    @Override
    public SubjectDTO updateSubject(SubjectDTO subjectDTO) {
        return null;
    }

    @Override
    public List<SubjectDTO> getAllSubjects() {
        return List.of();
    }

    @Override
    public void deleteSubject(int subjectId) {

    }

    @Override
    public SubjectDTO getSubjectById(int subjectId) {
        return null;
    }
}
