package com.movie.user.pc.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	// 得到一个vip用户的所有影片相应的评论
	@GetMapping("/{vip_id}")
	@ResponseBody
	public List<CommentModel> find(@PathVariable int vip_id){
		return service.find(vip_id);
	}
	
}
