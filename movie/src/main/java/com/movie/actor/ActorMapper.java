package com.movie.actor;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * 添加演员，从视图 actor_info 中查看演员信息
 * 
 * @author QQ546
 *
 */
public interface ActorMapper {

	// 演员的基本信息
	@Insert("insert into actor(actor_name, actor_sex, actor_country, actor_birth, actor_desc) value(#{name}, #{sex}, #{country}, #{birth}, #{desc})")
	void create(ActorModel actor);

	// 演员海报
	@Insert("insert into actor_pic(actor_id, actor_pic) value(#{actor_id}, #{actor_pic})")
	void addPic(int id, String actor_pic);

	// 使用视图 actor_info (详细设计)
	@Select("select * from actor_info")
	List<ActorModel> find();

}
