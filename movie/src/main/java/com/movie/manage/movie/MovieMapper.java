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

	// 得到导演id
	@Select("select director_id as directorId from director where director_name = #{directorName}")
	int getDirectorId(String directorName);

	// 得到影片id
	@Select("select movie_id as movieId from movie where movie_name = #{movieName}")
	String getMovieId(String movieName);

	// 表movie
	@Select("select movie_id as movieId, movie_name as movieName, movie_type as movieType, movie_country as movieCountry, movie_score as movieScore,"
			+ "director_id as directorId, movie_date as movieDate, movie_desc as movieDesc, movie_ratings as movieRatings, movie_dimension as movieDimension from movie")
	List<MovieModel> findBase();

	// 表movie 通过name
	@Select("select movie_id as movieId, movie_name as movieName, movie_type as movieType, movie_country as movieCountry, movie_score as movieScore,"
			+ "movie_date as movieDate, movie_desc as movieDesc, movie_ratings as movieRatings, movie_dimension as movieDimension from movie where movie_name = #{movieName}")
	List<MovieModel> findByName(String movieName);

	// 视图movie_show
	@Select("select * from movie_show")
	List<MovieModel> findAll();

	// 视图movie_show 通过id
	@Select("select * from movie_show where movieId = #{movieId}")
	List<MovieModel> find(int movieId);

	// 添加基本信息 表movie
	@Insert("insert into movie(movie_name, movie_type, movie_country, movie_score, movie_date, movie_desc, director_id, movie_ratings, movie_dimension) value(#{movieName}, #{movieType}, #{movieCountry}, #{movieScore}, #{movieDate}, #{movieDesc}, #{directorId}, #{movieRatings}, #{movieDimension})")
	void create(MovieModel movie);

	// 添加海报
	@Insert("insert into poster(movie_id, poster_pic) value(#{movieId}, #{posterPic}")
	void addPic(int movieId, String posterPic);

	@Update("update movie set movie_name=#{movieName}, movie_type=#{movieType}, movie_country=#{movieCountry}, movie_score=#{movieScore}, movie_date=#{movieDate}, movie_desc=#{movieDesc}, movie_ratings=#{movieRatings}, movie_dimension=#{movieDimension} where movie_id = #{movieId}")
	void update(MovieModel movie);

	// movie,score,comment,collect,movie_item,poster
	@Delete("delete from movie where movie_id = #{movieId}")
	void removeMovie(int movieId);

	@Delete("delete from score where movie_id = #{movieId}")
	void removeScore(int movieId);

	@Delete("delete from comment where movie_id = #{movieId}")
	void removeComment(int movieId);

	@Delete("delete from collect where movie_id = #{movieId}")
	void removeCollect(int movieId);

	@Delete("delete from movie_item where movie_id = #{movieId}")
	void removeMovie_item(int movieId);

	@Delete("delete from poster where movie_id = #{movieId}")
	void removePoster(int movieId);
}
