package com.codeclan.example.employee_lab.controllers;


import com.codeclan.example.employee_lab.models.Department;
import com.codeclan.example.employee_lab.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }
}
