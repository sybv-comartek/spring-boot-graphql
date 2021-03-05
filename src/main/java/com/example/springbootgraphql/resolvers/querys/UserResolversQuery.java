package com.example.springbootgraphql.resolvers.querys;

import com.example.springbootgraphql.domain.User.User;
import com.example.springbootgraphql.servieves.users.userImlServiece;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
@Component
public class UserResolversQuery implements GraphQLQueryResolver {
    @Autowired
    private userImlServiece imlServiece;
    public User user(Long id){
        return imlServiece.getUser(id);
    }
}