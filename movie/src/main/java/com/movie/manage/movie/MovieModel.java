package com.movie.manage.movie;

/**
 * 影片的id, name, type, country, score, date, desc, director_id, ratings,
 * dimension, poster_pic
 * 
 * @author QQ546
 *
 */
public class MovieModel {

	int movie_id;
	String movie_name;
	String movie_type;
	String movie_country;
	double movie_score;
	String movie_date;
	String movie_desc;
	int director_id;
	String director_name;
	String movie_ratings;
	int movie_dimension;
	String poster_pic;

	public MovieModel() {

	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMovie_type() {
		return movie_type;
	}

	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}

	public String getMovie_country() {
		return movie_country;
	}

	public void setMovie_country(String movie_country) {
		this.movie_country = movie_country;
	}

	public double getMovie_score() {
		return movie_score;
	}

	public void setMovie_score(double movie_score) {
		this.movie_score = movie_score;
	}

	public String getMovie_date() {
		return movie_date;
	}

	public void setMovie_date(String movie_date) {
		this.movie_date = movie_date;
	}

	public String getMovie_desc() {
		return movie_desc;
	}

	public void setMovie_desc(String movie_desc) {
		this.movie_desc = movie_desc;
	}

	public int getDirector_id() {
		return director_id;
	}

	public void setDirector_id(int director_id) {
		this.director_id = director_id;
	}

	public String getMovie_ratings() {
		return movie_ratings;
	}

	public void setMovie_ratings(String movie_ratings) {
		this.movie_ratings = movie_ratings;
	}

	public int getMovie_dimension() {
		return movie_dimension;
	}

	public void setMovie_dimension(int movie_dimension) {
		this.movie_dimension = movie_dimension;
	}

	public String getPoster_pic() {
		return poster_pic;
	}

	public void setPoster_pic(String poster_pic) {
		this.poster_pic = poster_pic;
	}

}
