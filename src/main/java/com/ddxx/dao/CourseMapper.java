package com.ddxx.dao;

import com.ddxx.model.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer cno);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer cno);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}