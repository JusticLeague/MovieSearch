package com.movie.actor;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 添加演员，从视图 actor_info 中查看演员信息
 * 
 * @author QQ546
 *
 */
@Mapper
public interface ActorMapper {

	// 演员的基本信息
	@Insert("insert into actor(actor_name, actor_sex, actor_country, actor_birth, actor_desc) value(#{name}, #{sex}, #{country}, #{birth}, #{desc})")
	void create(ActorModel actor);

	// 演员海报
	@Insert("insert into actor_pic(actor_id, actor_pic) value(#{id}, #{pic})")
	void addPic(int id, String actor_pic);

	// 使用视图 actor_info (详细设计)
	@Select("select * from actor_info")
	List<ActorModel> find();
	
	// 删除演员
	@Delete("delete from actor where actor_id = #{id}")
	void remove(int id);
	
	// 删除图片
	@Delete("delete from actor_pic where actor_id = #{id}")
	void removePic(int id);
	
	// 修改信息
	@Update("update actor set actor_name = #{name}, actor_sex = #{sex}, actor_birth = #{birth}, actor_country = #{country}, actor_desc = #{desc} where actor_id = #{id}")
	void update(ActorModel actor);

}
