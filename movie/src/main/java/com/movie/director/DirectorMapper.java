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
 * 视图 name,country,sex,birth,desc,pic,movie
 * @author QQ546
 *
 */
@Mapper
public interface DirectorMapper {

	// 插入基本信息
	@Insert("insert into director(director_name, director_sex, director_country, director_birth, director_desc) value(#{director_name}, #{director_sex}, #{director_country}, #{director_birth}, #{director_desc})")
	void create(DirectorModel director);

	// 上传图片
	@Insert("insert into director_pic(director_id, director_pic) value(#{director_id}, #{director_pic}")
	void addPic(int id, String pic);

	// 使用 director_info 视图 （详细设计）
	@Select("select * from director_info")
	List<DirectorModel> find();

	// 删除导演
	@Delete("delete from director where director_id = #{director_id}")
	void remove(int director_id);

	// 删除图片
	@Delete("delete from director_pic where director_id = #{director_id}")
	void removePic(int director_id);

	// 修改信息
	@Update("update director set director_name = #{director_name}, director_sex = #{director_sex}, director_birth = #{director_birth}, director_country = #{director_country}, director_desc = #{director_desc} where director_id = #{director_id}")
	void update(DirectorModel director);

}
