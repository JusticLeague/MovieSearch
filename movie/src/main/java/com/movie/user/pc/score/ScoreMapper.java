package com.movie.user.pc.score;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {

	@Insert("insert into score(vip_id, movie_id, score) value(#{vip_id}, #{movie_id}, #{score}")
	void create(ScoreModel score);
	
}
