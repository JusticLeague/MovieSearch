package com.movie.manage.movie;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 使用视图movie_show
 * 
 * @author QQ546
 *
 */
@Mapper
public interface MovieMapper {

	
//	@Select("select * from movie")
//	List<MovieModel> findMovie();
//
//	@Select("select poster_pic from poster, movie where movie.movie_id = poster.movie_id ")
//	List<String> findPic();
	
	// 视图movie_show
	@Select("select * from movie_show")
	List<MovieModel> findAll();

	@Select("select * from movie_show where movie_id = #{movie_id}")
	List<MovieModel> find(int movie_id);
	
	// 添加基本信息
	@Insert("insert into movie(movie_name, movie_type, movie_country, movie_score, movie_date, movie_desc, movie_director_id, movie_ratings, movie_dimension) value(#{movie_name}, #{movie_type}, #{movie_country}, #{movie_score}, #{movie_date}, #{movie_desc}, #{movie_director_id}, #{movie_ratings}, #{movie_dimension}")
	void create(MovieModel movie);

	// 添加海报
	@Insert("insert into poster(movie_id, poster_pic) value(#{movie_id}, #{poster_pic}")
	void addPic(int movie_id, String poster_pic);

	@Update("update movie set movie_name=#{movie_name}, movie_type=#{movie_type}, movie_country=#{movie_country}, movie_score=#{movie_score}, movie_date=#{movie_date}, movie_desc=#{movie_desc}, director_id=#{director_id}, movie_ratings=#{movie_ratings}, movie_dimension=#{movie_dimension} where movie_id = #{movie_id})")
	void update(MovieModel movie);

	@Delete("delete from movie where movie_id = #{movie_id}")
	void remove(int movie_id);

	@Delete("delete from poster where movie_id = #{movie_id}")
	void reomvePic(int movie_id);

}
