package com.aa.entity;

import lombok.Data;

import java.util.List;

@Data
public class Classes {
    private String name;
    private long id;
    private List<Student> students;
}
