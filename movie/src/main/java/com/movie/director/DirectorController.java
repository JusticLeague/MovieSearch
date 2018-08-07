package com.movie.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.movie.actor.ActorModel;

@Controller
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	DirectorService service;

	@PostMapping
	public void create(DirectorModel director) {
		service.create(director);
	}

	@PostMapping("/{director_id}")
	public void addPic(@RequestParam(value = "director_id", required = true) int director_id,
			@RequestParam(value = "director_pic", required = false) String director_pic) {
		service.addPic(director_id, director_pic);
	}

	// 删除
	@DeleteMapping("/{director_id}")
	public void delete(@PathVariable int director_id) {
		service.remove(director_id);
	}

	// 修改
	@PutMapping("/{director_id}")
	public void update(@PathVariable int director_id, @RequestBody DirectorModel director) {
		service.update(director);
	}

}
