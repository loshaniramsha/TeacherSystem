package org.example.teachersystem.service;

import org.example.teachersystem.dto.MarksDTO;

import java.util.List;

public interface MarksService {
    MarksDTO saveMarks(MarksDTO marksDTO);
    MarksDTO updateMarks(MarksDTO marksDTO);
    List<MarksDTO> getAllMarks();
    void deleteMarks(int marksId);
    List<MarksDTO> getMarksByStudent(int studentId);

}
