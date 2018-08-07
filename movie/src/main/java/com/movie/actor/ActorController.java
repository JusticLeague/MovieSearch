package com.movie.actor;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/actor")
public class ActorController {

	@Autowired
	ActorService service;

	// 展示演员
	@GetMapping
	@ResponseBody
	public List<ActorModel> list() {
		return service.find();
	}

	// 创建演员
	@PostMapping
	public String create(ActorModel actor) {
		service.create(actor);
		return "redirect:/manage.html";
	}

	// 添加海报
	// 要先得到演员id
	@PostMapping("/{id}")
	public void addPic(@RequestParam(value = "actor_id", required = true) int id,
			@RequestParam(value = "actor_pic", required = false) String actor_pic) {
		service.addPic(id, actor_pic);
	}
	
	// 删除
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.remove(id);
	}
	
	// 修改
	@PutMapping("/{id}")
	public void update(@PathVariable int id,
			@RequestBody ActorModel actor) {
		service.update(actor);
	}
	

}
