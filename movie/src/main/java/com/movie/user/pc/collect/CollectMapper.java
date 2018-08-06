package com.movie.user.pc.collect;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

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
	@Delete("delete from collect where collect = #{id}")
	void remove(int id);
	
}
