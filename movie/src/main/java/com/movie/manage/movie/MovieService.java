package com.movie.manage.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	MovieMapper mapper;
	
	// 表 movie
	public List<MovieModel> findBase(){
		return mapper.findBase();
	}

	// 视图movie_show信息
	public List<MovieModel> findAll(){
		return mapper.findAll();
	}
	
	// 视图movie_show 通过id
	public List<MovieModel> find(int movieId){
		return mapper.find(movieId);
	}
	
	// 添加基本信息
	public void create(MovieModel movie) {
		mapper.create(movie);
	}
	
	// 添加海报
	public void addPic(int movieId, String posterPic) {
		mapper.addPic(movieId, posterPic);
	}
	
	// 删除影片包括海报
	public void remove(int movieId) {
		mapper.remove(movieId);
		mapper.reomvePic(movieId);
	}
	
	// 修改
	public void update(MovieModel movie) {
		mapper.update(movie);
	}
	
}
