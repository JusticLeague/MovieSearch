package com.movie.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	DirectorService service;

	@PostMapping
	public void create(DirectorModel director) {
		service.create(director);
	}

	@PostMapping
	public void addPic(@RequestParam(value = "director_id", required = true) int id,
			@RequestParam(value = "director_pic", required = false) String pic) {
		service.addPic(id, pic);
	}

}
