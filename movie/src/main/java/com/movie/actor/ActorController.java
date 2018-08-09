package com.movie.actor;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorController {

	@Autowired
	ActorService service;

	// 展示演员
	@GetMapping("/{actor_id}")
	@ResponseBody
	public List<ActorModel> find(@PathVariable int actor_id) {
		return service.find(actor_id);
	}

//	// 海报
//	@GetMapping
//	@ResponseBody
//	public List<ActorModel> findPic() {
//		return service.findPic();
//	}

	// 创建演员
	@PostMapping
	public void create(ActorModel actor) {
		service.create(actor);
//		return "redirect:/manage.html";
	}

	// 添加海报
	// 要先得到演员id
	@PostMapping("/{id}")
	public void addPic(@RequestParam(value = "actor_id", required = true) int actor_id,
			@RequestParam(value = "actor_pic", required = false) String actor_pic) {
		service.addPic(actor_id, actor_pic);
	}

	// 删除
	@DeleteMapping("/{actor_id}")
	public void delete(@PathVariable int actor_id) {
		service.remove(actor_id);
	}

	// 修改
	@PutMapping("/{actor_id}")
	public void update(@PathVariable int actor_id, @RequestBody ActorModel actor) {
		service.update(actor);
	}

}
