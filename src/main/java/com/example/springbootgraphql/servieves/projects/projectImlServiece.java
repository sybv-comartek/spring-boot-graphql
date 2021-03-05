package com.example.springbootgraphql.servieves.projects;

import com.example.springbootgraphql.domain.projects.CreateProjectInput;
import com.example.springbootgraphql.domain.projects.Project;
import com.example.springbootgraphql.repositorys.projectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class projectImlServiece implements projectServiece {
    @Autowired
    private projectRepository projectRepository;

    @Override
    public Project getProject(Long id) {
        // TODO Auto-generated method stub
        return projectRepository.getById(id);
    }

    @Override
    public Project createProject(CreateProjectInput input) {
        // TODO Auto-generated method stub
        return projectRepository.createProject(input.getDescription(),input.getName(),input.getNote(),input.getUid());
    }

}
