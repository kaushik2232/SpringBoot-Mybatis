package com.studentcourse.mybatis.springbootmybatis;

import com.studentcourse.mybatis.springbootmybatis.model.course;
import com.studentcourse.mybatis.springbootmybatis.model.student;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes({student.class,course.class})
@MapperScan("com.studentcourse.mybatis.springbootmybatis")
@SpringBootApplication
public class SpringbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}

}
