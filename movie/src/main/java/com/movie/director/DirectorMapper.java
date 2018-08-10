package com.movie.director;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 添加导演、添加海报
 * 视图 name,country,sex,birth,desc,pic,movie
 * @author QQ546
 *
 */
@Mapper
public interface DirectorMapper {

	// 插入基本信息
	@Insert("insert into director(director_name, director_sex, director_country, director_birth, director_desc) value(#{directorName}, #{directorSex}, #{directorCountry}, #{directorBirth}, #{directorDesc})")
	void create(DirectorModel director);

	// 上传图片
	@Insert("insert into director_pic(director_id, director_pic) value(#{directorId}, #{directorPic}")
	void addPic(int id, String pic);
	
	
	// 使用视图director_info 使用id
	@Select("select * from director_info where directorId = #{directorId}")
	List<DirectorModel> find(int directorId);
	
	// 视图director_info 
	@Select("select * from director_info")
	List<DirectorModel> findAll();
	
	// 表director 通过name 查找
	@Select("select director_id as directorId, director_name as directorName, director_sex as directorSex, director_country as directorCountry, "
			+ "director_birth as directorBirth, director_desc as directorDesc from director where director_name = #{directorName}")
	List<DirectorModel> findByName(String name);
	
	// 表 director 
	@Select("select director_id as directorId, director_name as directorName, director_sex as directorSex, director_country as directorCountry, "
			+ "director_birth as directorBirth, director_desc as directorDesc from director")
	List<DirectorModel> findBase();

	// 删除导演
	@Delete("delete from director where director_id = #{directorId}")
	void remove(int directorId);

	// 删除图片
	@Delete("delete from director_pic where director_id = #{directorId}")
	void removePic(int directorId);

	// 修改信息
	@Update("update director set director_name = #{directorName}, director_sex = #{directorSex}, director_birth = #{directorBirth}, director_country = #{directorCountry}, director_desc = #{directorDesc} where director_id = #{directorId}")
	void update(DirectorModel director);

}
