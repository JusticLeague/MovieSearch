package com.movie.user.pc.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/score")
public class ScoreController {

	@Autowired
	ScoreService service;
	
	@PostMapping
	public void create(ScoreModel score) {
		service.create(score);
	}
	
}
