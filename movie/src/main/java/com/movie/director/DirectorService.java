package com.movie.director;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DirectorService {

	@Autowired
	DirectorMapper mapper;

	// 添加导演
	public void create(DirectorModel director) {
		mapper.create(director);
	}

	// 添加海报
	public void addPic(int director_id, String pic) {
		mapper.addPic(director_id, pic);
	}

	// 删除包括图片
	@Transactional
	public void remove(int director_id) {
		mapper.remove(director_id);
		mapper.removePic(director_id);
	}

	// 修改信息
	public void update(DirectorModel actor) {
		mapper.update(actor);
	}
	
	// 得到导演的基本信息包括图片
	public List<DirectorModel> find(){
		return mapper.find();
	}

	//查询导演
	public List<DirectorModel> findAll() {
		return mapper.find();
	}
}
