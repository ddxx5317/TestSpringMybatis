package com.ddxx.dao;

import java.util.List;

import com.ddxx.model.Score;
import com.ddxx.model.ScoreKey;

public interface ScoreMapper {
    int deleteByPrimaryKey(ScoreKey key);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(ScoreKey key);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
    
    public List<Score> getScoreList();
}