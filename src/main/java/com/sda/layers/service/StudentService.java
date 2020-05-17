package com.sda.layers.service;

import com.sda.layers.model.Student;
import com.sda.layers.repository.StudentRepository;

import java.util.List;

public class StudentService {
    public StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
