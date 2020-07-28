package com.aa.test;

import com.aa.repository.ClassesRepository;
import com.aa.repository.CustomerRepository;
import com.aa.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //一对多的两种情况，很好分辨，只看实体类即可
        //1.如果对应的是对象，用association&javaType
        //2.如果对应的是集合，用collection&ofType
//        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
//        System.out.println(studentRepository.findById(1));
////        sqlSession.close();
//        ClassesRepository classesRepository=sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(2));
//        sqlSession.close();
        //多对多的情况
        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
        System.out.println(customerRepository.findById(1));
        sqlSession.close();

    }
}
