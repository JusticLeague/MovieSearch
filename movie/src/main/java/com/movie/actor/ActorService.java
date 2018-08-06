package com.movie.actor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ActorService {
	
	@Autowired
	ActorMapper mapper;
	
	// 添加演员
	public void create(ActorModel actor) {
		mapper.create(actor);
	}
	
	// 添加演员海报
	public void addPic(int id, String actor_pic) {
		mapper.addPic(id, actor_pic);
	}
	
	// 演员的所有信息包括海报
	public List<ActorModel> find(){
		return mapper.find();
	}
	
	// 删除包括图片
	@Transactional
	public void remove(int id) {
		mapper.remove(id);
		mapper.removePic(id);
	}
	
	// 修改信息
	public void update(ActorModel actor) {
		mapper.update(actor);
	}

}
