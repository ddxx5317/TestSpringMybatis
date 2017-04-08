package com.ddxx.model;

import java.util.List;

public class Score extends ScoreKey {
	
	private List<Student> students;
    private Integer score;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}