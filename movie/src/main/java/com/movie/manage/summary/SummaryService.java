package com.movie.manage.summary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummaryService {

	@Autowired
	SummaryMapper mapper;
	
	// 年份
	public YearModel year(){
		YearModel model = new YearModel();
		model.setArr1(mapper.year());
		model.setArr2(mapper.yearNum());
		return model;
		
	}
	
	// 评分
	public ScoreModel score() {
		ScoreModel model = new ScoreModel();
		model.setArr1(mapper.score());
		model.setArr2(mapper.scoreNum());
		return model;
	}
	
}
