package com.movie.manage.summary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/summary")
public class SummaryController {
	
	@Autowired
	SummaryMapper mapper;
	
	// 年份表
	@GetMapping("/year")
	public List<Integer> year(){
		return mapper.year();
	}
	
	// 年份数量表
	@GetMapping("/yearNum")
	public List<Integer> yearNum(){
		return mapper.yearNum();
	}
	
	// 评分(升序)
	@GetMapping("/score")
	public List<Integer> score(){
		return mapper.score();
	}
	
	// 评分数量
	@GetMapping("/scoreNum")
	public List<Integer> scoreNum(){
		return mapper.scoreNum();
	}
	

}
