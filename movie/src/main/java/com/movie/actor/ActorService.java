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
	public void addPic(int id, String actorPic) {
		mapper.addPic(id, actorPic);
	}

	// 演员视图信息
	public List<ActorModel> find(int actorId) {
		return mapper.find(actorId);
	}
	
	// 视图actor_info
	public List<ActorModel> findAll() {
		return mapper.findAll();
	}
	
	// 表actor 基础信息
	public List<ActorModel> findBase(){
		return mapper.findBase();
	}
	
	// 表actor 通过name 查找
	public List<ActorModel> findByName(String name){
		return mapper.findByName(name);
	}

	// // 海报
	// public List<ActorModel> findPic() {
	// return mapper.findPic();
	// }

	// 删除包括图片
	@Transactional
	public void remove(int actorId) {
		mapper.remove(actorId);
		mapper.removePic(actorId);
	}

	// 修改信息
	public void update(ActorModel actor) {
		mapper.update(actor);
	}

}
