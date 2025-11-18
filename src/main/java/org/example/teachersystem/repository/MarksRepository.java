package org.example.teachersystem.repository;

import org.example.teachersystem.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks,Integer> {
}
