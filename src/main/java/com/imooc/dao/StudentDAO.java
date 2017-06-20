package com.imooc.dao;

import com.imooc.domian.Student;

import java.util.List;

/**
 * StudentDAO 访问接口
 */
public interface StudentDAO {

    /**
     * 查询所有的学生
     * @return 所有学生
     */
    List<Student> query();

    /**
     * 保存一个学生
     * @param student
     */
    void save(Student student);
}
