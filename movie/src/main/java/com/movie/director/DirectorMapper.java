package com.movie.director;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.movie.actor.ActorModel;

/**
 * 添加导演、添加海报
 * 
 * @author QQ546
 *
 */
@Mapper
public interface DirectorMapper {

	@Insert("insert into director(director_name, director_sex, director_country, director_birth, director_desc) value(#{name}, #{sex}, #{country}, #{birth}, #{desc})")
	void create(DirectorModel director);

	@Insert("insert into director_pic(director_id, director_pic) value(#{id}, #{pic}")
	void addPic(int id, String pic);

	// 使用 director_info 视图 （详细设计）
	@Select("select * from director_info")
	List<DirectorModel> find();

	// 删除导演
	@Delete("delete from director where director_id = #{id}")
	void remove(int id);

	// 删除图片
	@Delete("delete from director_pic where director_id = #{id}")
	void removePic(int id);

	// 修改信息
	@Update("update director set director_name = #{name}, director_sex = #{sex}, director_birth = #{birth}, director_country = #{country}, director_desc = #{desc} where director_id = #{id}")
	void update(DirectorModel director);

}
