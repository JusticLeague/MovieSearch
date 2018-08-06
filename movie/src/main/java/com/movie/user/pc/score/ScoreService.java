package com.movie.user.pc.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

	@Autowired
	ScoreMapper mapper;
	
	// 添加评分
	public void create(ScoreModel score) {
		mapper.create(score);
	}
	
	
}
