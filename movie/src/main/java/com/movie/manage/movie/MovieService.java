package com.movie.manage.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	MovieMapper mapper;

	// 得到导演Id
	public int getDirectorId(String directorName) {
		return mapper.getDirectorId(directorName);
	}

	// 得到影片的id
	public int getMovieId(String movieName) {
		return mapper.getMovieId(movieName);
	}

	// 表 movie
	public List<MovieModel> findBase() {
		return mapper.findBase();
	}

	// 表movie 通过name
	public List<MovieModel> findByName(String movieName) {
		return mapper.findByName(movieName);
	}

	// 视图movie_show信息
	public List<MovieModel> findAll() {
		return mapper.findAll();
	}

	// 视图movie_show 通过id
	public List<MovieModel> find(int movieId) {
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
		mapper.removeScore(movieId);
		mapper.removeComment(movieId);
		mapper.removeCollect(movieId);
		mapper.removeMovie_item(movieId);
		mapper.removePoster(movieId);
		mapper.removeMovie(movieId);
	}

	// 修改
	public void update(MovieModel movie) {
		mapper.update(movie);
	}

}
