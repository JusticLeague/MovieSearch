package com.movie.user.pc.collect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/collect")
public class CollectController {

	@Autowired
	CollectService service;
	
	// 添加收藏
	@PostMapping
	public void create(CollectModel collect) {
		service.create(collect);
	}
	
	// 删除
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		service.remove(id);
	}
	
	
}
