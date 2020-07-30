package com.aa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//implements Serializable(实体类实现序列化接口以成功开启二级缓存)
public class Account implements Serializable {
    private long id;
    private String username;
    private String password;
    private int age;

}
