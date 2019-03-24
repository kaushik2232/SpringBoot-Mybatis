package com.studentcourse.mybatis.springbootmybatis.mapper;

import com.studentcourse.mybatis.springbootmybatis.model.course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Select("select * from course")
    List<course> findAll();

    @Delete("delete from course where cname = #{cname}")
    void delete(course Course);



    @Insert("insert into course (cid,cname,ctaught,sid) values(#{cid},#{cname},#{ctaught},#{sid})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "sid",
            before = false, resultType = Integer.class)
    void insert(course Course);
}
