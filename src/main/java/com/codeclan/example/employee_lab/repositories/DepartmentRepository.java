package com.codeclan.example.employee_lab.repositories;

import com.codeclan.example.employee_lab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
