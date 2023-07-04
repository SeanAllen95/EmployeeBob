package com.codeclan.example.Employees.repositories;

import com.codeclan.example.Employees.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
