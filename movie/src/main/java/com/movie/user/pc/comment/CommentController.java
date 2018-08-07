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
public class CommentController {
	
	@Autowired
	CommentService service;

	// 添加评论
	@RequestMapping("/comment")
	@PostMapping
	public void create(CommentModel comment) {
		service.create(comment);
	}
	
	// 删除评论
	@RequestMapping("/comment")
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		service.remove(id);
	}
	
	// 得到一个vip用户的所有影片相应的评论
	@RequestMapping("/comment")
	@GetMapping("/{vip_id}")
	@ResponseBody
	public List<CommentModel> find(@PathVariable int vip_id){
		return service.find(vip_id);
	}
	
	// 统计某部影片有多少评论
//	@RequestMapping("/")
//	@GetMapping("/")
//	@ResponseBody
//	public int numble(int movie_id) {
//		return service.numble(movie_id);
//	}
	
}
