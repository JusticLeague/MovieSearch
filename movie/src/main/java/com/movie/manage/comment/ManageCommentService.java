package com.movie.manage.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.user.pc.comment.CommentModel;

@Service
public class ManageCommentService {

	@Autowired
	ManageCommentMapper mapper;
	
	// 所有的评论
	public List<CommentModel> find(){
		return mapper.find();
	}
	
	// 删除
	public void remove(int id) {
		mapper.remove(id);
	}
	
}
