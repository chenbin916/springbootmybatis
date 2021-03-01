package com.cbin.study.mybatis.service;

import com.cbin.study.mybatis.entity.Student;
import com.cbin.study.mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;


    public List<Student> findAll(){
        return studentMapper.findAll();

    };
    public Student findById(long id){
        return studentMapper.findById(id);
    };
    public void save(Student student){
        studentMapper.save(student);
    };
    public void update(Student student){
        studentMapper.update(student);
    };
    public void deleteById(long id){
        studentMapper.deleteById(id);

    };
    public int count(){
        return studentMapper.count();
    };


}
