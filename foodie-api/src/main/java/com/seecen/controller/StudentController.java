package com.seecen.controller;

import com.seecen.pojo.Student;
import com.seecen.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable("id") Integer id) {
        return studentService.findById(id);
    }
    @PostMapping("/student/save")
    public int save(Student student) {
        return studentService.save(student);
    }

}
