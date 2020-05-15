package com.seecen.service;

import com.seecen.pojo.Student;

public interface IStudentService {
    Student findById(Integer id);
    int save(Student student);
}
