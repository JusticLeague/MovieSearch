package com.movie.manage.summary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/summary")
public class SummaryController {
	
	@Autowired
	SummaryService service;
	
	// 年份
	@GetMapping("/year")
	public YearModel year(){
		return service.year();
	}
	

	
	// 评分
	@GetMapping("/score")
	public ScoreModel score(){
		return service.score();
	}


}
