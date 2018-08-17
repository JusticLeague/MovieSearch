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

	@Insert("insert into comment(vip_id, movie_id, cmt_comment) value(#{vipId}, #{movieId}, #{cmtComment}")
	void create(CommentModel comment);

	@Delete("delete from comment where cmt_id = #{cmtId}")
	void remove(int cmtId);

	// 得到一个用户的所有影片相应的评论
	@Select("select movie_name as movieName, cmt_comment as cmtComment from movie, comment where movie.movie.id = comment.movie.id and comment.vip_id = #{vipId}")
	List<CommentModel> find(int vipId);
	
	// 得到该影片的所有评论
	@Select("select cmt_comment as cmtComment from comment where movie_id = #{movieId}")
	List<CommentModel> getComment(int movieId);

	// 统计某部影片有多少收藏
	@Select("select count(vip_id as vipId) from comment where movie_id = #{movieId}")
	int sum(int movieId);

}
