package com.aa.test;

import com.aa.entity.Account;
import com.aa.repository.AccountRepository;
import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现接口的代理对象
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//        //增
//        Account account = new Account(2l, "李光洙", "234", 36);
//        accountRepository.save(account);
//        sqlSession.commit();
//        sqlSession.close();
//        //删
//        accountRepository.deleteById(1);
//        sqlSession.commit();
//        sqlSession.close();
//        //改
//        Account account1 = new Account(2l, "池易洙", "520", 23);
//        accountRepository.update(account1);
//        sqlSession.commit();
//        sqlSession.close();
//        //全部查找
//        List<Account> list = accountRepository.findAll();
//        for (Account account2 : list) {
//            System.out.println(account2);
//        }
//        sqlSession.commit();
//        sqlSession.close();
//        //通过ID查找
//        Account account2 = accountRepository.findById(3);
//        System.out.println(account2);
//        sqlSession.commit();
//        sqlSession.close();
        //通过包装类的ID查找
//        Long id = Long.parseLong("1");
//        Account account2 = accountRepository.findById(id);
//        System.out.println(account2);
//        sqlSession.commit();
//        sqlSession.close();
        //通过名字查找
//        Account account=accountRepository.findByName("池易洙");
//        System.out.println(account);
//        sqlSession.commit();
//        sqlSession.close();
        //多个参数查询（通过名字和年龄）
//        Account account=accountRepository.findByNameAndAge("池易洙",23);
//        System.out.println(account);
//        sqlSession.commit();
//        sqlSession.close();
        //基本数据类型，统计Account的总数
//        System.out.println(accountRepository.count());
//        sqlSession.close();
        //包装类，统计Account的总数
//        System.out.println(accountRepository.count2());
//        sqlSession.close();
        //String类型，通过id查找name
        String name=accountRepository.findNameById(2);
        System.out.println(name);
        sqlSession.close();
        //Java Bean类型 ，其实就是之前的 findById方法。返回的是一个类对象（Bean）



    }
}
