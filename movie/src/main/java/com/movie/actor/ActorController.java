package com.movie.actor;

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
	public List<ActorModel> findAll(){
		return service.findAll();
	}
	
	// 表actor 通过name
	@GetMapping("/name/{actorName}")
	@ResponseBody
	public List<ActorModel> findByName(@PathVariable String actorName){
		return service.findByName(actorName);
	}
	
	// 表actor
	@GetMapping("/base")
	@ResponseBody
	public List<ActorModel> findBase(){
		return service.findBase();
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
	public void addPic(@PathVariable int actorId,
			@RequestParam(value = "actor_pic", required = false) String actorPic) {
		service.addPic(actorId, actorPic);
	}

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
