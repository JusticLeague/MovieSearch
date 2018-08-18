package com.movie.user.pc.score;

import java.util.List;

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
	
	// 得到影片各个评分的人数
	public  List<ScoreModel> list(int movieId){
		return mapper.list(movieId);
	}
	
}
