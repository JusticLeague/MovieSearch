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
=======

>>>>>>> f7d2ba882358695dbb1c2169f8912ca21476e88f
	// 表movie 通过name
	@GetMapping("/base/{movieName}")
	@ResponseBody
	public List<MovieModel> findByName(@PathVariable String movieName) {
		return service.findByName(movieName);
	}

	// 创建基本信息
	@PostMapping
<<<<<<< HEAD
	public String create(@RequestBody MovieModel movie) {
		if(service.getMovieId(movie.getMovieName()) > 0) {
			return "影片存在";
		}
		movie.setDirectorId(service.getDirectorId(movie.getDirectorName()));
=======
	public void create(
			@RequestBody MovieModel movie) {
		movie.setDirectorId(service.getId(movie.directorName));
>>>>>>> f7f185814e4a0dcba5a3e792f684fc23e9c1f902
		service.create(movie);
		return "创建成功";
	}

	// 添加海报
	@PostMapping("/{movieId}")
	public void addPic(@PathVariable int movieId,
			@RequestParam(value = "posterPic", required = false) String posterPic) {
		service.addPic(movieId, posterPic);
	}

	// 修改
	@PutMapping("/{movieId}")
	public void update(@RequestBody MovieModel movie) {
<<<<<<< HEAD
		movie.setDirectorId(service.getDirectorId(movie.getDirectorName()));
=======
//		movie.setDirectorId(service.getId(directorName));
>>>>>>> f7f185814e4a0dcba5a3e792f684fc23e9c1f902
		service.update(movie);
	}

	// 删除
	@DeleteMapping("/{movieId}")
	public void remove(Integer movieId) {
		service.remove(movieId);
	}

}
