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

import com.movie.actor.ActorService;
import com.movie.manage.GetPicPath;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService service;

	@Autowired
	ActorService aservice;

	@Autowired
	MovieItemService mservice;

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

	// 表movie 通过name
	@GetMapping("/base/{movieName}")
	@ResponseBody
	public List<MovieModel> findByName(@PathVariable String movieName) {
		return service.findByName(movieName);
	}

	// 创建基本信息
	@PostMapping
	public String create(@RequestBody MovieModel movie, @RequestParam("actors") String[] actors) {

		if (service.getMovieId(movie.getMovieName()) != null) {
			return "已存在！";
			
		} else {
			// 设置导演ID
			movie.setDirectorId(service.getDirectorId(movie.getDirectorName()));
			service.create(movie);

			MovieItemModel item = new MovieItemModel();

			// 得到movieID
			int movieId = movie.getMovieId();
			item.setMovieId(movieId);

			for (String actor : actors) {
				
				// 得到演员ID
				int actorId = aservice.getIntId(actor);
				item.setActorId(actorId);

				mservice.create(item);
			}

			return "创建成功！";
		}
	}

	// 添加海报
	@PostMapping("/{movieName}")
	public void addPoster(@PathVariable String movieName) {

		String path = "";

		// 得到影片ID
		int movieId = service.getMoiveIntId(movieName);

		// 得到图片路径
		String posterPic = GetPicPath.getPath(path, movieName);

		service.addPic(movieId, posterPic);

	}

	// 修改
	@PutMapping("/{movieId}")
	public void update(@RequestBody MovieModel movie) {
		movie.setDirectorId(service.getDirectorId(movie.getDirectorName()));
		// movie.setDirectorId(service.getId(directorName));
		service.update(movie);
	}

	// 删除
	@DeleteMapping("/{movieId}")
	public void remove(@PathVariable int movieId) {
		service.remove(movieId);
	}

}
