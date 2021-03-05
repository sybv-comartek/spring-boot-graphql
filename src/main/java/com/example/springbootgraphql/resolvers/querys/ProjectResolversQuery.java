package com.example.springbootgraphql.resolvers.querys;

import com.example.springbootgraphql.domain.projects.Project;
import com.example.springbootgraphql.servieves.projects.projectImlServiece;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
@Component
public class ProjectResolversQuery implements GraphQLQueryResolver {
    @Autowired
    private projectImlServiece projectImlServiece;
    public Project getProject(Long id){
        return projectImlServiece.getProject(id);
    }
}
