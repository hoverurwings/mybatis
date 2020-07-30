package com.aa.repository;

import com.aa.entity.Account;

import java.util.List;

public interface AccountRepository {
    public int save(Account account);
    public int deleteById(long id);
    public int update(Account account);
    public List<Account> findAll();
    public Account findById (long id);
    public Account findById2 (Long id);
    public Account findByName(String name);
    public Account findByNameAndAge(String name,int age);
    public int count();
    public Integer count2();
    public String findNameById(int id);
    public Account findByAccount(Account account);
}
