package com.aa.entity;

import lombok.Data;

import java.util.List;

@Data
public class Goods {
    private String name;
    private long id;
    private List<Customer> customers;
}
