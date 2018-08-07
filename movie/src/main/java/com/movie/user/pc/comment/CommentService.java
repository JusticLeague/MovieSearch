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
	public List<CommentModel> find(int vip_id) {
		return mapper.find(vip_id);
	}

	// 统计某部影片有多少评论量
	public int numble(int movie_id) {
		return mapper.sum(movie_id);
	}

}
