package com.movie.user.pc.collect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CollectController {

	@Autowired
	CollectService service;

	// 添加收藏
	@RequestMapping("/collect")
	@PostMapping
	public void create(CollectModel collect) {
		service.create(collect);
	}

	// 删除
	@RequestMapping("/collect")
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		service.remove(id);
	}

	// 得到一个人的所有收藏影片name
	@RequestMapping("/collect")
	@GetMapping()
	@ResponseBody
	public List<String> find() {
		return service.getName();
	}

	// 得到一个影片的收藏量
	@RequestMapping("/")
	@GetMapping()
	@ResponseBody
	public int numble(@RequestParam int movie_id) {
		return service.numble(movie_id);
	}

}
