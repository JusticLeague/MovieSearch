package com.movie.user.pc.score;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ScoreMapper {

	@Insert("insert into score(vip_id, movie_id, score) value(#{vipId}, #{movieId}, #{score}")
	void create(ScoreModel score);
	
	// 得到一个影片的评分（平均值）
	@Select("select avg(score) from score where movie_id = #{movieId}")
	double sum(int movieId);
	
	// 影片的评分等级的各个人数
	@Select("select score ,count(*) as number from score where movie_id = #{movieId} group by score order by score desc")
	List<ScoreModel> list(int movieId);
	
}
