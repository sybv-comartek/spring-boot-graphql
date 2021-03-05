package com.example.springbootgraphql.servieves.users;


import com.example.springbootgraphql.domain.User.User;

public interface userServiece {
    User getUser(Long id);
}
