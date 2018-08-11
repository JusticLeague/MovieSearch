package com.movie.user.pc.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/score")
public class ScoreController {

	@Autowired
	ScoreService service;

	@PostMapping
	public void create(ScoreModel score) {
		service.create(score);
	}

	// 得到一个影片的评分（平均值）
	@GetMapping("/score/{movieId}")
	@ResponseBody
	public double score(@PathVariable int movieId) {
		return service.score(movieId);
	}

}
