package com.studentCrud.practice.service;

import com.studentCrud.practice.entity.Student;
import com.studentCrud.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    //add student
    public Student saveStudent(Student student){

        return repository.save(student);

    }

    //get all student
    public List<Student> getAllStudent(){
        return repository.findAll();
    }

    //find by id student

    public Student getStudentById(Long id){
        return repository.findById(id).orElse(null);
    }

    //delete student
    public void deleteStudentById(Long id){
         repository.deleteById(id);
    }
}
