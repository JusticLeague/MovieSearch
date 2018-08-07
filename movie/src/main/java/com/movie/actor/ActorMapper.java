package com.movie.actor;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 添加演员，从视图 actor_info 中查看演员信息 
 * 视图 name,country,sex,birth,desc,pic,movie
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

	// 视图actor_info
	@Select("select * from actor_info")
	List<ActorModel> find();

	// 演员的基本信息
	@Insert("insert into actor(actor_name, actor_sex, actor_country, actor_birth, actor_desc) value(#{actor_name}, #{actor_sex}, #{actor_country}, #{actor_birth}, #{actor_desc})")
	void create(ActorModel actor);

	// 演员海报
	@Insert("insert into actor_pic(actor_id, actor_pic) value(#{actor_id}, #{actor_pic})")
	void addPic(int id, String actor_pic);

//	// 使用视图 actor_info (详细设计)
//	@Select("select * from actor")
//	List<ActorModel> find();
	
	// 删除演员
	@Delete("delete from actor where actor_id = #{actor_id}")
	void remove(int actor_id);

	// 删除图片
	@Delete("delete from actor_pic where actor_id = #{actor_id}")
	void removePic(int actor_id);

	// 修改信息
	@Update("update actor set actor_name = #{actor_name}, actor_sex = #{actor_sex}, actor_birth = #{actor_birth}, actor_country = #{actor_country}, actor_desc = #{actor_desc} where actor_id = #{actor_id}")
	void update(ActorModel actor);

}
