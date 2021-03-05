package com.example.springbootgraphql.resolvers.mutations;

import com.example.springbootgraphql.domain.projects.CreateProjectInput;
import com.example.springbootgraphql.domain.projects.Project;
import com.example.springbootgraphql.servieves.projects.projectImlServiece;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;
@Component
public class ProjectResolversMutation implements GraphQLMutationResolver {
    @Autowired
    private projectImlServiece imlServiece;
    public Project createProject(CreateProjectInput input){
        return imlServiece.createProject(input);
    }
}
