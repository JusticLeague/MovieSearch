package com.movie.manage.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieItemService {
	
	@Autowired
	MovieItemMapper mapper;

	// 添加影片 演员的连接
	public void create(MovieItemModel item) {
		mapper.create(item);
	}
	
	
	public List<MovieItemModel> findAll(){
		return mapper.findAll();
	}
	
	// 查找演员的电影
	public List<Integer> findMovie(int actorId){
		return mapper.findMovieId(actorId);
	}
	
	// 查找电影的演员
	public List<Integer> findActor(int movieId){
		return mapper.findActorId(movieId);
	}
	
	
	
}
