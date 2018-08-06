package com.movie.actor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public void create(ActorModel actor) {
		service.create(actor);
	}

	// 添加海报
	// 要先得到演员id
	@PostMapping
	public void addPic(@RequestParam(value = "actor_id", required = true) int id,
			@RequestParam(value = "actor_pic", required = false) String actor_pic) {
		service.addPic(id, actor_pic);
	}

}
