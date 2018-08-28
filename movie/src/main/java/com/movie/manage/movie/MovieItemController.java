package com.movie.manage.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/item")
public class MovieItemController {

	@Autowired
	MovieItemService service;

	// 创建影片演员表
//	@PostMapping()
//	public void create(@RequestBody String movieName, @RequestBody String[] actors) {
//
//		MovieItemModel item = new MovieItemModel();
//
//		// 得到movieID
//		int movieId = mservice.getMoiveIntId(movieName);
//		item.setMovieId(movieId);
//
//		for (String string : actors) {
//			// 得到演员ID
//			int actorId = aservice.getIntId(string);
//			item.setActorId(actorId);
//
//			service.create(item);
//
//		}
//
//	}

	@GetMapping()
	@ResponseBody
	public List<MovieItemModel> findAll() {
		return service.findAll();
	}

	// 查找演员的电影
	@GetMapping("/actor/{actorId}")
	@ResponseBody
	public List<Integer> findMovie(@PathVariable int actorId) {
		return service.findMovie(actorId);
	}

	// 查找电影的演员
	@GetMapping("/movie/{movieId}")
	@ResponseBody
	public List<Integer> findActoe(@PathVariable int movieId) {
		return service.findActor(movieId);
	}

}
