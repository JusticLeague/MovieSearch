package com.movie.manage.movie;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MovieMapper {

	@Select("select * from movie")
	List<MovieModel> findMovie();

	@Select("select poster_pic from poster, movie where movie.movie_id = poster.movie_id ")
	List<String> findPic();

	// 添加基本信息
	@Insert("insert into movie(name, type, country, score, date, desc, director_id, ratings, dimension) value(#{name}, #{type}, #{country}, #{score}, #{date}, #{desc}, #{director_id}, #{ratings}, #{dimension}")
	void create(MovieModel movie);

	// 添加海报
	@Insert("insert into poster(movie_id, poster_pic) value(#{id}, #{poster_pic}")
	void addPic(int id, String poster_pic);

	@Update("update movie set name=#{name}, type=#{type}, country=#{country}, score=#{score}, date=#{date}, desc=#{desc}, director_id=#{director_id}, ratings=#{ratings}, dimension=#{dimension} where id = #{id})")
	void update(MovieModel movie);

	@Delete("delete from movie where id = #{id}")
	void remove(int id);

	@Delete("delete from poster where movie_id = #{id}")
	void reomvePic(int id);

}
