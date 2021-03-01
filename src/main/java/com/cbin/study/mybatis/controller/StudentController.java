package com.cbin.study.mybatis.controller;

import com.cbin.study.mybatis.entity.Student;
import com.cbin.study.mybatis.service.StudentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student){
        studentService.update(student);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@PathVariable("id") Long id){
        studentService.deleteById(id);
    }









}
