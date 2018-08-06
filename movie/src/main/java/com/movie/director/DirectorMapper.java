package com.movie.director;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

}
