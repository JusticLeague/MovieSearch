package com.movie.manage.summary;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SummaryMapper {

	// 视图year_view 得到年份
	@Select("select year from year_view group by year")
	List<Integer> year();
	
	// 视图year_view 得到年份的数量
	@Select("select count(*) as number from year_view group by year")
	List<Integer> yearNum();
	
	// 得到分数(升序)
	@Select("select movie_score as score from movie group by movie_score order by movie_score")
	List<Integer> score();
	
	// 得分数量
	@Select("select count(*) as number from movie group by movie_score order by movie_score")
	List<Integer> scoreNum();
	
	
	
	
	
}
