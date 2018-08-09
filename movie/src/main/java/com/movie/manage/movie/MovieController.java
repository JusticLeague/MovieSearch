package com.movie.manage.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService service;

	@GetMapping
	@ResponseBody
	public List<MovieModel> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{movieId}")
	@ResponseBody
	public List<MovieModel> find(@PathVariable int movieId){
		return service.find(movieId);
	}

	// 创建基本信息
	@PostMapping
	public void create(MovieModel movie) {
		service.create(movie);
	}

	// 添加海报
	@PostMapping("/{movieId}")
	public void addPic(@RequestParam(value = "movie_id", required = true) int movieId,
			@RequestParam(value = "poster_pic", required = false) String posterPic) {
		service.addPic(movieId, posterPic);
	}

	// 修改
	@PutMapping("/{movieId}")
	public void update(@PathVariable int movieId, @RequestBody MovieModel movie) {
		service.update(movie);
	}

	// 删除
	@DeleteMapping("/{movieId}")
	public void remove(@PathVariable int movieId) {
		service.remove(movieId);
	}

}
