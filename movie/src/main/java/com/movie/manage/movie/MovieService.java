package com.movie.manage.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	MovieMapper mapper;

	// 视图movie_show信息
	public List<MovieModel> findAll(){
		return mapper.findAll();
	}
	
	public List<MovieModel> find(int movie_id){
		return mapper.find(movie_id);
	}
	
	// 添加基本信息
	public void create(MovieModel movie) {
		mapper.create(movie);
	}
	
	// 添加海报
	public void addPic(int movie_id, String poster_pic) {
		mapper.addPic(movie_id, poster_pic);
	}
	
	// 删除影片包括海报
	public void remove(int movie_id) {
		mapper.remove(movie_id);
		mapper.reomvePic(movie_id);
	}
	
	// 修改
	public void update(MovieModel movie) {
		mapper.update(movie);
	}
	
}
