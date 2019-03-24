package com.studentcourse.mybatis.springbootmybatis.resource;

import com.studentcourse.mybatis.springbootmybatis.mapper.CourseMapper;
import com.studentcourse.mybatis.springbootmybatis.model.course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/view/course")
public class CourseResource {

private CourseMapper courseMapper;

    public CourseResource(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    @GetMapping("/all")
    public List<course> getAll(){
        return courseMapper.findAll();
    }

    @GetMapping("/update")
    private List<course> update() {

        course Course = new course();
        Course.setCname("DBMS");
        Course.setCid('4');
        Course.setCtaught("Prof.david");

        courseMapper.insert(Course);
        return courseMapper.findAll();
    }

    @GetMapping("/delete")
    private List<course> delete() {

        course Course = new course();
        Course.setCname("DBMS");

        courseMapper.delete(Course);
        return courseMapper.findAll();
    }
}
