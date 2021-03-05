package com.example.springbootgraphql.domain.projects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProjectInput {
    private String name;
    private String description;
    private String note;
    private Long uid;
}
