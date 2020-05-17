package com.sda.layers.repository;

import com.sda.layers.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMemoryRepository implements StudentRepository{

    private List<Student> students;

    public StudentMemoryRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(this.students);
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }
}
