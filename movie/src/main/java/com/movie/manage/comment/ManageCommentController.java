package com.movie.manage.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.user.pc.comment.CommentModel;

@RestController
@RequestMapping("/manage")
public class ManageCommentController {

	@Autowired
	ManageCommentService service;
	
	// 所有的评论
	@GetMapping
	public List<CommentModel> find(){
		return service.find();
	}
	
	// 删除
	@DeleteMapping("/{cmtId}")
	public void remove(@PathVariable int cmtId) {
		service.remove(cmtId);
	}
	
}
