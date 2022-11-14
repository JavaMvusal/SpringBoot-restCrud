package com.vusalmustafayev.tutorials.FirstApp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public List<Student> getAllStudents(){
       return studentService.getAllStudents();
    }

    @RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
    public Optional<Student> getById(@PathVariable String id){
       return studentService.getStudent(id);
    }
    @RequestMapping(value = "/students",method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @RequestMapping(value = "/students/{id}",method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student,@PathVariable String id){
        studentService.updateStudent(id,student);
    }
    @RequestMapping(value = "/students/{id}",method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
    }
}
