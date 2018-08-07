package com.movie.manage.comment;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.movie.user.pc.comment.CommentModel;

@Mapper
public interface ManageCommentMapper {
	
	// 找出所有的评论
	@Select("select cmt_comment from comment")
	List<CommentModel> find();
	
	// 按评论id删除
	@Delete("delete from comment where cmt_id = #{cmt_id}")
	void remove(int cmt_id);

}
