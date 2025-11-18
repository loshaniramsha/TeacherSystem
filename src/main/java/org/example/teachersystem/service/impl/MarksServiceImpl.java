package org.example.teachersystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.teachersystem.dto.MarksDTO;
import org.example.teachersystem.service.MarksService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarksServiceImpl implements MarksService {
    @Override
    public MarksDTO saveMarks(MarksDTO marksDTO) {
        return null;
    }

    @Override
    public MarksDTO updateMarks(MarksDTO marksDTO) {
        return null;
    }

    @Override
    public List<MarksDTO> getAllMarks() {
        return List.of();
    }

    @Override
    public void deleteMarks(int marksId) {

    }

    @Override
    public List<MarksDTO> getMarksByStudent(int studentId) {
        return List.of();
    }
}
