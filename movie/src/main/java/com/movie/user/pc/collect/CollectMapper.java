package com.movie.user.pc.collect;

import java.util.List;

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
	@Insert("insert into collect(vip_id, movie_id) value(#{vipId}, #{movieId}")
	void create(CollectModel collect);
	
	// 删除
	@Delete("delete from collect where collect_id = #{collectId}")
	void remove(int collectId);
	
	// 查找得到影片name
	@Select("select moive_name as movieName from movie, collect where movie.movie.id = collect.movie.id")
	List<String> getName();
	
	// 统计某部影片有多少收藏
	@Select("select count(vip_id as vipId) from collect where movie_id = #{movieId}")
	int sum(int movieId);
	
	
	
}
