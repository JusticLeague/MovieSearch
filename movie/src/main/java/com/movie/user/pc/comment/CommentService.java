package com.movie.user.pc.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

	@Autowired
	CommentMapper mapper;

	// 添加
	public void create(CommentModel comment) {
		mapper.create(comment);
	}

	// 删除
	public void remove(int id) {
		mapper.remove(id);
	}

}
