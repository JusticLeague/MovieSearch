package com.movie.director;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.actor.ActorModel;

@RestController
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	DirectorService service;

	// 查询导演所有信息
	@GetMapping
	public List<DirectorModel> find() {
		return service.findAll();
	}

	@PostMapping
	public String create(DirectorModel director) {
		service.create(director);
		return "redirect:/manage.html";
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
	public void update(@PathVariable int id, @RequestBody DirectorModel director) {
		service.update(director);
	}

}
