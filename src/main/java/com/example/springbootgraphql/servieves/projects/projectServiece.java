package com.example.springbootgraphql.servieves.projects;

import com.example.springbootgraphql.domain.projects.CreateProjectInput;
import com.example.springbootgraphql.domain.projects.Project;

public interface projectServiece {
    Project getProject(Long id);
    Project createProject(CreateProjectInput input);
}
