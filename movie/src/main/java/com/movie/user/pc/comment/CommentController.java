package com.movie.user.pc.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentService service;

	// 添加评论
	@PostMapping
	public void create(CommentModel comment) {
		service.create(comment);
	}
	
	// 删除评论
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		service.remove(id);
	}
	
	
}
