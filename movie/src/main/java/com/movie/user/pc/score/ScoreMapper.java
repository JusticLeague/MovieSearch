package com.movie.user.pc.score;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ScoreMapper {

	@Insert("insert into score(vip_id, movie_id, score) value(#{vip_id}, #{movie_id}, #{score}")
	void create(ScoreModel score);
	
	// 得到一个影片的评分（平均值）
	@Select("select avg(score) from score where movie_id = #{movie_id}")
	double sum(int movie_id);
	
}
