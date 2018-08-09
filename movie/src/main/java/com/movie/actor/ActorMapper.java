package com.movie.actor;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 添加演员，从视图 actor_info 中查看演员信息 视图 name,country,sex,birth,desc,pic,movie
 * 
 * @author QQ546
 *
 */
@Mapper
public interface ActorMapper {

	// @Select("select * from actor")
	// List<ActorModel> find();
	//
	// @Select("select actor_pic from actor, actor_pic where actor.actor_id =
	// actor_pic.actor_id ")
	// List<ActorModel> findPic();

	// 视图actor_info 通过id
	@Select("select actor_id as actorId, actor_name as actorName, actor_sex as actorSex, actor_country as actorCountry, actor_birth as actorBirth,"
			+ "actor_desc as actorDesc, movie_name as movieName, actor_pic as actorPic from actor_info where actor_id = #{actorId}")
	List<ActorModel> find(int actorId);
	
	// 视图actor_info
	@Select("select actor_id as actorId, actor_name as actorName, actor_sex as actorSex, actor_country as actorCountry, actor_birth as actorBirth,"
			+ "actor_desc as actorDesc, movie_name as movieName, actor_pic as actorPic from actor_info")
	List<ActorModel> findAll();
	
	// 表actor
	@Select("select actor_id as actorId, actor_name as actorName, actor_sex as actorSex, actor_country as actorCountry, actor_birth as actorBirth,"
			+ "actor_desc as actorDesc from actor ")
	List<ActorModel> findBase();
	
	// 表actor 通过name 查找
	@Select("select actor_id as actorId, actor_name as actorName, actor_sex as actorSex, actor_country as actorCountry, actor_birth as actorBirth, actor_desc as actorDesc from actor where actor_name = #{actorName}")
	List<ActorModel> findByName(String name);

	// 演员的基本信息
	@Insert("insert into actor(actor_name, actor_sex, actor_country, actor_birth, actor_desc) value(#{actorName}, #{actorSex}, #{actorCountry}, #{actorBirth}, #{actorDesc})")
	void create(ActorModel actor);

	// 演员海报
	@Insert("insert into actor_pic(actor_id, actor_pic) value(#{actorId}, #{actorPic})")
	void addPic(int id, String actorPic);

	// 删除演员
	@Delete("delete from actor where actor_id = #{actorId}")
	void remove(int actorId);

	// 删除图片
	@Delete("delete from actor_pic where actor_id = #{actorId}")
	void removePic(int actorId);

	// 修改信息
	@Update("update actor set actor_name = #{actorName}, actor_sex = #{actorSex}, actor_birth = #{actorBirth}, actor_country = #{actorCountry}, actor_desc = #{actorDesc} where actor_id = #{actorId}")
	void update(ActorModel actor);

}
