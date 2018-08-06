package com.movie.user.pc.comment;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 对评论的添加、删除
 * 
 * @author QQ546
 *
 */
@Mapper
public interface CommentMapper {

	@Insert("insert into comment(vip_id, movie_id, cmt_comment) value(#{vip_id}, #{movie_id}, #{comment}")
	void create(CommentModel comment);
	
	@Delete("delete from comment where cmt_id = #{id}")
	void remove(int id);
	
}
