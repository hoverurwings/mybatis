package com.aa.repository;

import com.aa.entity.Student;

public interface StudentRepository {
    public Student findById(long id);
}
