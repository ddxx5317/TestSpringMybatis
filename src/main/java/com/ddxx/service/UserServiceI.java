package com.ddxx.service;

import java.util.List;

import com.ddxx.model.Score;
import com.ddxx.model.Student;

public interface UserServiceI {

	public Student getStudentByNo(Integer id);
	
	public List<Score> getScoreList();

}
