package com.movie.manage.comment;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.movie.user.pc.comment.CommentModel;

@Mapper
public interface ManageCommentMapper {

	// 通过视图comment_view 得到所有信息cmtId,vipName,movieName,cmtComment
	@Select("select * from comment_view")
	List<CommentModel> find();

	// 按评论id删除
	@Delete("delete from comment where cmt_id = #{cmtId}")
	void remove(int cmtId);

}
