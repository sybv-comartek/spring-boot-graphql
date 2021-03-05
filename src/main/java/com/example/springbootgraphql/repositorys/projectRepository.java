package com.example.springbootgraphql.repositorys;

import com.example.springbootgraphql.domain.projects.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
@EnableJpaRepositories
public interface projectRepository extends JpaRepository<Project,Long>  {
    Project getById(Long id);
    @Modifying
    @Query(
      value = 
        "INSERT INTO `projects`(`id`, `description`, `name`, `note`, `uid`) VALUES (null,:description, :name, :note, :uid)",
      nativeQuery = true)
    Project createProject(@Param("description") String description,@Param("name") String name,
    @Param("note") String note,@Param("uid") Long uid);
}
