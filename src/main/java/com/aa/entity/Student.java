package com.aa.entity;

import lombok.Data;

@Data
public class Student {
    private long id;
    private String name;
    private Classes classes;
}
