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
	
	// 得到一个影片的评分（平均值）
	public double score(int movieId) {
		return mapper.sum(movieId);
	}
	
}
