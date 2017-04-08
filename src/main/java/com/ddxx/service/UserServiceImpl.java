package com.ddxx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddxx.dao.ScoreMapper;
import com.ddxx.dao.StudentMapper;
import com.ddxx.model.Score;
import com.ddxx.model.Student;

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private ScoreMapper scoreMapper;

	@Override
	public Student getStudentByNo(Integer id) {
		return studentMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<Score> getScoreList() {
		return scoreMapper.getScoreList();
	}
}
