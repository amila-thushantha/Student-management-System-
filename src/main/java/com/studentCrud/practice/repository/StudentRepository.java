package com.studentCrud.practice.repository;

import com.studentCrud.practice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
