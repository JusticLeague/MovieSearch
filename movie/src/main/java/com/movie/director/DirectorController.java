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
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;

import com.movie.actor.ActorModel;
=======
>>>>>>> 316453ba2adf6253a0dbfbd8589176107b77280d

@RestController
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	DirectorService service;
	
	// 得到视图
	@GetMapping
	@ResponseBody
	public List<DirectorModel> find(){
		return service.find();
	}

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
<<<<<<< HEAD
	@PutMapping("/{id}")
	public void update(@PathVariable int id, @RequestBody DirectorModel director) {
=======
	@PutMapping("/{director_id}")
	public void update(@PathVariable int director_id, @RequestBody DirectorModel director) {
>>>>>>> 316453ba2adf6253a0dbfbd8589176107b77280d
		service.update(director);
	}

}
