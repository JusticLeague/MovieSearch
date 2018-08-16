package com.movie.actor;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/actor")
public class ActorController {

	@Autowired
	ActorService service;

	// 视图actor_info 展示演员
	@GetMapping("/id/{actorId}")
	@ResponseBody
	public List<ActorModel> find(@PathVariable int actorId) {
		return service.find(actorId);
	}

	// 视图actor_info
	@GetMapping
	@ResponseBody
	public List<ActorModel> findAll() {
		return service.findAll();
	}

	// 表actor 通过name
	@GetMapping("/name/{actorName}")
	@ResponseBody
	public List<ActorModel> findByName(@PathVariable String actorName) {
		return service.findByName(actorName);
	}

	// 表actor
	@GetMapping("/base")
	@ResponseBody
	public List<ActorModel> findBase() {
		return service.findBase();
	}

	// 创建演员
	@PostMapping
<<<<<<< HEAD
	public void create(@RequestBody ActorModel actor) {
=======
	public String create(ActorModel actor) {
		if (service.getId(actor.getActorName()) > 0) {
			return "演員存在";
		}
>>>>>>> 89115cd54f7c3fffaa9cf30d7333df848833e015
		service.create(actor);
		return "创建成功！";
	}

//	// 添加海报
//	@PostMapping("/{actorName}")
//	public void addPic(@PathVariable String actorName,
//			@RequestParam(value = "actorPic", required = false) String actorPic) {
//		service.addPic(service.getId(actorName), actorPic);
//	}
	
	

	// 删除
	@DeleteMapping("/{actorId}")
	public void delete(@PathVariable int actorId) {
		service.remove(actorId);
	}

	// 修改
	@PutMapping("/{actorId}")
	public void update(@PathVariable int actorId, @RequestBody ActorModel actor) {
		service.update(actor);
	}

}
