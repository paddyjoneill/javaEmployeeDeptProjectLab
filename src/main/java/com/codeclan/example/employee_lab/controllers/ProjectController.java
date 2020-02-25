package com.codeclan.example.employee_lab.controllers;


import com.codeclan.example.employee_lab.models.Project;
import com.codeclan.example.employee_lab.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getProjects(){
        return projectRepository.findAll();
    }

}
