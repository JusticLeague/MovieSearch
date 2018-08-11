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

	// 视图movie_show
	@GetMapping
	@ResponseBody
	public List<MovieModel> findAll() {
		return service.findAll();
	}

	// 视图movie_show 通过id
	@GetMapping("/{movieId}")
	@ResponseBody
	public List<MovieModel> find(@PathVariable int movieId) {
		return service.find(movieId);
	}

	// 表movie
	@GetMapping("/base")
	@ResponseBody
	public List<MovieModel> findBase() {
		return service.findBase();
	}

<<<<<<< HEAD
	// 表movie
=======
	// 表movie 通过name
>>>>>>> 58d9b8604c3c586054210354345591acf548830a
	@GetMapping("/base/{movieName}")
	@ResponseBody
	public List<MovieModel> findByName(@PathVariable String movieName) {
		return service.findByName(movieName);
	}

	// 创建基本信息
	@PostMapping
	public void create(@RequestParam(value = "directorName", required = true) String directorName,
			@RequestBody MovieModel movie) {
		movie.setDirectorId(service.getId(directorName));
		service.create(movie);
	}

	// 添加海报
	@PostMapping("/{movieId}")
	public void addPic(@PathVariable int movieId,
			@RequestParam(value = "posterPic", required = false) String posterPic) {
		service.addPic(movieId, posterPic);
	}

	// 修改
	@PutMapping("/{movieId}")
	public void update(@RequestBody MovieModel movie,
			@RequestParam(value = "directorName", required = false) String directorName) {
		movie.setDirectorId(service.getId(directorName));
		service.update(movie);
	}

	// 删除
	@DeleteMapping("/{movieId}")
	public void remove(@PathVariable int movieId) {
		service.remove(movieId);
	}

}
