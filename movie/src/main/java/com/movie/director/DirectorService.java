package com.movie.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movie.actor.ActorModel;

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

	// 删除包括图片
	@Transactional
	public void remove(int id) {
		mapper.remove(id);
		mapper.removePic(id);
	}

	// 修改信息
	public void update(DirectorModel actor) {
		mapper.update(actor);
	}

}
