package com.seecen.service.impl;

import com.seecen.mapper.StudentMapper;
import com.seecen.pojo.Student;
import com.seecen.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Student findById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int save(Student student) {
        return studentMapper.insert(student);
    }
}
