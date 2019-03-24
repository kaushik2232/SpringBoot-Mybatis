package com.studentcourse.mybatis.springbootmybatis.mapper;

import com.studentcourse.mybatis.springbootmybatis.model.student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import java.util.List;

@Mapper
public interface StudentMapper {


    @Select("select * from student")
    List<student> findAll();

    @Insert("insert into student(sid, sname, semail) values(#{sid},#{sname},#{semail})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "sid",
            before = false, resultType = Integer.class)
    void insert(student Student);

}
