package com.example.springbootgraphql.repositorys;

import com.example.springbootgraphql.domain.User.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
@EnableJpaRepositories
public interface userRepository extends JpaRepository<User,Long>  {
    User getById(Long id);
}
