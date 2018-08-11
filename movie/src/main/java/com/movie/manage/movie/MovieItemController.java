package com.movie.manage.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class MovieItemController {

	@Autowired
	MovieItemService service;
	
	@PostMapping
	public void create(@RequestBody MovieItemModel item) {
		service.create(item);
	}
	
	@GetMapping()
	@ResponseBody
	public List<MovieItemModel> findAll(){
		return service.findAll();
	}
	
	// 查找演员的电影
	@GetMapping("/actorId/{actorId}")
	@ResponseBody
	public List<MovieItemModel> findMovie(@PathVariable int actorId){
		return service.findMovie(actorId);
	}
	
	// 查找电影的演员
	@GetMapping("/movieId/{movieId}")
	@ResponseBody
	public List<MovieItemModel> findActoe(@PathVariable int movieId){
		return service.findActor(movieId);
	}
	
	
}
