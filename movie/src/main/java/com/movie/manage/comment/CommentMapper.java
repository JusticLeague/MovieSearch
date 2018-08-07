package com.movie.manage.comment;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.movie.user.pc.comment.CommentModel;

@Mapper
public interface CommentMapper {
	
	@Select("select cmt_comment from comment")
	List<CommentModel> find();
	
	@Delete("delete from comment where cmt_id = #{id}")
	void remove(int id);

}
