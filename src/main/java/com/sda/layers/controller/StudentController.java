package com.sda.layers.controller;

import com.sda.layers.model.Student;
import com.sda.layers.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> findAll(){
        return studentService.findAll();
    }
}
