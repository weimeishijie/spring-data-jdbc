package com.imooc.dao;

import com.imooc.domian.Student;
import org.junit.Test;

import java.util.List;

/**
 * Created by mj on 2017/6/18.
 */
public class StudentsDAOImplTest {

    @Test
    public void testQuety(){

        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> students = studentDAO.query();

        for(Student student:students){
            System.out.println("id:"+student.getId()+", name:"+student.getName()+", age:"+student.getAge());
        }
    }

    @Test
    public void testSave(){

        StudentDAO studentDAO = new StudentDAOImpl();
        Student student = new Student();
        student.setName("test");
        student.setAge(30);
        studentDAO.save(student);

    }
}
