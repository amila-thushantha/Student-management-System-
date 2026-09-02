package com.studentCrud.practice.controller;

import com.studentCrud.practice.entity.Student;
import com.studentCrud.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/addStudent")
public class StudentController {

    @Autowired
    private StudentService service;

    //create student
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);

    }

    //delete student
    @GetMapping
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

    //get student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return service.getStudentById(id);
    }

    //delete student by id
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id){
         service.deleteStudentById(id);
    }


}
