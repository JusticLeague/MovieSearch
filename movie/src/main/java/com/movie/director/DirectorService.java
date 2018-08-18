package com.movie.director;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorService {

	@Autowired
	DirectorMapper mapper;

	// 得到id
	public String getId(String directorName) {
		return mapper.getId(directorName);
	}

	// 添加导演
	public void create(DirectorModel director) {
		mapper.create(director);
	}

	// 添加海报
	public void addPic(int directorId, String directorPic) {
		mapper.addPic(directorId, directorPic);
	}

	// 删除包括图片(将movie中的director_id变为null)
	public void remove(int directorId) {
		mapper.set(directorId);
		mapper.removePic(directorId);
		mapper.remove(directorId);
	}

	// 修改信息
	public void update(DirectorModel actor) {
		mapper.update(actor);
	}

	// 视图director_info 得到导演的基本信息包括图片
	public List<DirectorModel> find(int directorId) {
		return mapper.find(directorId);
	}

	// 视图director_info
	public List<DirectorModel> findAll() {
		return mapper.findAll();
	}

	// 表director 通过name 查找
	public List<DirectorModel> findByName(String name) {
		return mapper.findByName(name);
	}

	// 表director
	public List<DirectorModel> findBase() {
		return mapper.findBase();
	}

}
