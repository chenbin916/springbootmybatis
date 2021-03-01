package com.cbin.study.mybatis.mapper;


import com.cbin.study.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    public List<Student> findAll();
    public Student findById(long id);
    public void save(Student student);
    public void update(Student student);
    public void deleteById(long id);
    public int count();
}
