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

	// 表movie 通过name
	@GetMapping("/base/{movieName}")
	@ResponseBody
	public List<MovieModel> findByName(@PathVariable String movieName) {
		return service.findByName(movieName);
	}

	// 创建基本信息
	@PostMapping
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
	public void create(@RequestBody MovieModel movie) {
=======
<<<<<<< HEAD
>>>>>>> d100fdcc4f36392bd7c28dcb7762bb39d527dc1d
>>>>>>> 2c3ac2a755bdae1bf9be3d920b3556ffaf957a71
	public String create(@RequestBody MovieModel movie) {
		if(service.getMovieId(movie.getMovieName()) > 0) {
			return "影片存在";
		}
		movie.setDirectorId(service.getDirectorId(movie.getDirectorName()));
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
	public void create(
			@RequestBody MovieModel movie) {
>>>>>>> 89115cd54f7c3fffaa9cf30d7333df848833e015
		movie.setDirectorId(service.getId(movie.directorName));
>>>>>>> f7f185814e4a0dcba5a3e792f684fc23e9c1f902
>>>>>>> d100fdcc4f36392bd7c28dcb7762bb39d527dc1d
>>>>>>> 2c3ac2a755bdae1bf9be3d920b3556ffaf957a71
		service.create(movie);
		return "创建成功";
	}

	// 添加海报
//	@PostMapping("/{movieId}")
//	public void addPic(@PathVariable int movieId,
//			@RequestParam(value = "posterPic", required = false) String posterPic) {
//		service.addPic(movieId, posterPic);
//	}
	
//	@PostMapping("/poster")
//	public String addPic(@RequestParam("file") MultipartFile file) {
//		if(!file.isEmpty()) {
//			try {
//				BufferedOutputStream out =new BufferedOutputStream(
//						new FileOutputStream(new File(
//								file.getOriginalFilename())));
//				System.out.println(file.getName());
//				out.write(file.getBytes());
//				out.flush();
//				out.close();
//			}catch (Exception e) {
//				e.printStackTrace();    
//                return "上传失败," + e.getMessage();   
//			}
//			return "上传成功";
//		}else {
//			return "空文件";
//		}
//	}

	// 修改
	@PutMapping("/{movieId}")
	public void update(@RequestBody MovieModel movie) {
		movie.setDirectorId(service.getDirectorId(movie.getDirectorName()));
<<<<<<< HEAD
//		movie.setDirectorId(service.getId(directorName));
=======
>>>>>>> 2c3ac2a755bdae1bf9be3d920b3556ffaf957a71
		service.update(movie);
	}

	// 删除
	@DeleteMapping("/{movieId}")
	public void remove(@PathVariable int movieId) {
		service.remove(movieId);
	}

}
