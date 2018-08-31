package com.movie.manage.summary;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SummaryMapper {

	// 视图year_view 得到年份
	@Select("select year from year_view group by year order by year")
	int[] year();
	
	// 视图year_view 得到年份的数量
	@Select("select sum(number) as number from year_view group by year order by year")
	int[] yearNum();
	
	// 得到分数(升序)
	@Select("select movie_score as score from movie group by movie_score order by movie_score")
	int[] score();
	
	// 得分数量
	@Select("select count(*) as number from movie group by movie_score order by movie_score")
	int[] scoreNum();
	
	
	
	
	
}
