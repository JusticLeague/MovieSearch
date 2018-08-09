package com.movie.user.pc.comment;

import java.util.List;

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
	public void remove(int cmt_id) {
		mapper.remove(cmt_id);
	}

	// 得到一个用户的所有影片相应的评论
	public List<CommentModel> find(int vipId) {
		return mapper.find(vipId);
	}

	// 统计某部影片有多少评论量
	public int numble(int movieId) {
		return mapper.sum(movieId);
	}

}
