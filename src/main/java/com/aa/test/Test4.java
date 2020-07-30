package com.aa.test;

import com.aa.entity.Account;
import com.aa.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test4 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //mybatis自带一级缓存，默认开启，且作用域是sqlSession级别,第一次执行的结果会保留在缓存中
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//        Account account = accountRepository.findById(2L);
//        System.out.println(account);
//        sqlSession.close();
//        //上面清除了缓存，sqlSession消失，一级缓存失效；但是Mapper级别的二级缓存仍然存在
//        //除此之外还有通过ehcache设置二级缓存，详见笔记
//        sqlSession = sqlSessionFactory.openSession();
//        accountRepository = sqlSession.getMapper(AccountRepository.class);
//        Account account1 = accountRepository.findById(2L);
//        System.out.println(account1);
//        sqlSession.close();
        Account account2=new Account();
        //此方法的意思是，创建一个Account，然后给它赋与数据库里面词条有记录的值（池易洙），以便查找数据库的记录
        //即使不完整地输入该记录的相关信息，也可以查询出相关词条
        account2.setUsername("池易洙");
        account2.setPassword("520");
        Account account3=accountRepository.findByAccount(account2);
        System.out.println(account3);
        sqlSession.close();
    }
}
