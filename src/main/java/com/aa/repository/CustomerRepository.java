package com.aa.repository;

import com.aa.entity.Customer;

public interface CustomerRepository {
    public Customer findById(long id);
}
