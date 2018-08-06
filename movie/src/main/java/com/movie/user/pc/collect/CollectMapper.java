package com.movie.user.pc.collect;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 对收藏的添加、删除
 * 
 * @author QQ546
 *
 */
@Mapper
public interface CollectMapper {

	// 添加
	@Insert("insert into collect(vip_id, movie_id) value(#{vip_id}, #{movie_id}")
	void create(CollectModel collect);
	
	// 删除
	@Delete("delete from collect where id = #{id}")
	void remove(int id);
	
	
	// 查找得到影片id
	@Select("select moive_id from collect where id = #{id}")
	void find();
	
	// 统计某部影片有多少收藏
	@Select("select movie_id, count(movie_id) as numble from collect group by movie_id")
	void sum();
	
	
	
}
