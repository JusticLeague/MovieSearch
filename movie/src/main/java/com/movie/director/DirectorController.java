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

	@PostMapping("/{id}")
	public void addPic(@RequestParam(value = "director_id", required = true) int id,
			@RequestParam(value = "director_pic", required = false) String pic) {
		service.addPic(id, pic);
	}

	// 删除
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.remove(id);
	}

	// 修改
	@PutMapping("/{id}")
	public void update(@PathVariable int id,
			@RequestBody DirectorModel director) {
		service.update(director);
	}

}
