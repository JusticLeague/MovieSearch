package com.movie.manage.movie;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MovieItemMapper {

	@Insert("insert into moive_item value(actor_id = #{ActorId}, movie_id = #{movieId})")
	void create(MovieItemModel item);
	
	@Select("select actor_id as actorId, movie_id as movieId from movie_item")
	List<MovieItemModel> findAll();
	
	// 查找演员的电影
	@Select("select movie_id as movieId from movie_item where actor_id = #{actorId}")
	List<MovieItemModel> findMovie(int actorId);
	
	// 查找电影的演员
	@Select("select actoer_id as actorId from movie_item where movie_id = #{movieId}")
	List<MovieItemModel> findActor(int movieId);
}
