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

	// @Select("select * from movie")
	// List<MovieModel> findMovie();
	//
	// @Select("select poster_pic from poster, movie where movie.movie_id =
	// poster.movie_id ")
	// List<String> findPic();

	// 视图movie_show
	@Select("select * from movie_show")
	List<MovieModel> findAll();

	@Select("select * from movie_show where movie_id = #{movieId}")
	List<MovieModel> find(int movieId);

	// 添加基本信息
	@Insert("insert into movie(movie_name, movie_type, movie_country, movie_score, movie_date, movie_desc, movie_director_id, movie_ratings, movie_dimension) value(#{movieName}, #{movieType}, #{movieCountry}, #{movieScore}, #{movieDate}, #{movieDesc}, #{directorId}, #{movieRatings}, #{movieDimension}")
	void create(MovieModel movie);

	// 添加海报
	@Insert("insert into poster(movie_id, poster_pic) value(#{movieId}, #{posterPic}")
	void addPic(int movieId, String posterPic);

	@Update("update movie set movie_name=#{movieName}, movie_type=#{movieType}, movie_country=#{movieCountry}, movie_score=#{movieScore}, movie_date=#{movieDate}, movie_desc=#{movieDesc}, director_id=#{directorId}, movie_ratings=#{movieRatings}, movie_dimension=#{movieDimension} where movie_id = #{movieId})")
	void update(MovieModel movie);

	@Delete("delete from movie where movie_id = #{movieId}")
	void remove(int movieId);

	@Delete("delete from poster where movie_id = #{movieId}")
	void reomvePic(int movieId);

}
