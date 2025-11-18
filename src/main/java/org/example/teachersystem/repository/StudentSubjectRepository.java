package org.example.teachersystem.repository;

import org.example.teachersystem.entity.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject, Integer> {
}
