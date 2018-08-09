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
	public List<MovieModel> find() {
		return service.find();
	}

	// 创建基本信息
	@PostMapping
	public void create(MovieModel movie) {
		service.create(movie);
	}

	// 添加海报
	@PostMapping("/{movie_id}")
	public void addPic(@RequestParam(value = "movie_id", required = true) int movie_id,
			@RequestParam(value = "poster_pic", required = false) String poster_pic) {
		service.addPic(movie_id, poster_pic);
	}

	// 修改
	@PutMapping("/{movie_id}")
	public void update(@PathVariable int movie_id, @RequestBody MovieModel movie) {
		service.update(movie);
	}

	// 删除
	@DeleteMapping("/{movie_id}")
	public void remove(@PathVariable int movie_id) {
		service.remove(movie_id);
	}

}
