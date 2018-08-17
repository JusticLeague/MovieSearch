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
	@DeleteMapping("/{cmtId}")
	public void remove(@PathVariable int cmtId) {
		service.remove(cmtId);
	}

	// 得到一个vip用户的所有影片相应的评论
	@GetMapping("/{vipId}")
	@ResponseBody
	public List<CommentModel> find(@PathVariable int vipId) {
		return service.find(vipId);
	}

	// 统计某部影片有多少评论
	@GetMapping("/number/{movieId}")
	@ResponseBody
	public int number(@PathVariable int movieId) {
		return service.number(movieId);
	}

	// 得到影片的所有评论
	@GetMapping("/movie/{movieId}")
	@ResponseBody
	public List<CommentModel> getComment(@PathVariable int movieId) {
		return service.getComment(movieId);
	}

}
