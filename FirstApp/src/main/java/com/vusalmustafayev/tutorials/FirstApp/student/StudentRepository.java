package com.vusalmustafayev.tutorials.FirstApp.student;

import com.vusalmustafayev.tutorials.FirstApp.student.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends CrudRepository<Student,String>{

}
