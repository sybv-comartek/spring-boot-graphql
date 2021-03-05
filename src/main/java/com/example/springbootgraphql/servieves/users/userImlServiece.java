package com.example.springbootgraphql.servieves.users;

import com.example.springbootgraphql.domain.User.User;
import com.example.springbootgraphql.repositorys.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userImlServiece implements userServiece {
    @Autowired
    private userRepository userRepository;

    @Override
    public User getUser(Long id) {
        // TODO Auto-generated method stub
        return userRepository.getById(id);
    }
    
}
