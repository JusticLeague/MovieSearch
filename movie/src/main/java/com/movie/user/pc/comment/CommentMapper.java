package com.movie.user.pc.comment;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 对评论的添加、删除
 * 
 * @author QQ546
 *
 */
@Mapper
public interface CommentMapper {

	@Insert("insert into comment(vip_id, movie_id, cmt_comment) value(#{vip_id}, #{movie_id}, #{cmt_comment}")
	void create(CommentModel comment);

	@Delete("delete from comment where cmt_id = #{cmt_id}")
	void remove(int cmt_id);

	// 得到一个用户的所有影片相应的评论
	@Select("select movie_name, cmt_comment from movie, comment where movie.movie.id = comment.movie.id and comment.vip_id = #{vip_id}")
	List<CommentModel> find(int vip_id);

	// 统计某部影片有多少收藏
	@Select("select count(vip_id) from comment where movie_id = #{movie_id}")
	int sum(int movie_id);

}
