package com.ddxx.dao;

import com.ddxx.model.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tno);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer tno);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}