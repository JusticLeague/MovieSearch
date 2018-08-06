package com.movie.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorService {

	@Autowired
	DirectorMapper mapper;
	
	// 添加导演
	public void create(DirectorModel director) {
		mapper.create(director);
	}
	
	// 添加海报
	public void addPic(int id, String pic) {
		mapper.addPic(id, pic);
	}
	
}
