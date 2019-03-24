package com.studentcourse.mybatis.springbootmybatis.resource;

import com.studentcourse.mybatis.springbootmybatis.mapper.StudentMapper;
import com.studentcourse.mybatis.springbootmybatis.model.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/student")
public class StudentResource {

    private StudentMapper studentMapper;

    public StudentResource(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @GetMapping("/all")
    public List<student> getAll(){
        return studentMapper.findAll();
    }

    @GetMapping("/update")
    private List<student> update(){

        student   Student = new student();
        Student.setSname("hagan");
        Student.setSemail("hag@gmail.com");
        Student.setSid('6');
        studentMapper.insert(Student);

        return studentMapper.findAll();
    }
}
