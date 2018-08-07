package com.movie.manage.movie;

/**
 * 影片的id, name, type, country, score, date, desc, director_id, ratings,
 * dimension, poster_pic
 * 
 * @author QQ546
 *
 */
public class MovieModel {

	int id;
	String name;
	String country;
	double score;
	String date;
	String desc;
	int director_id;
	String ratings;
	int dimension;
	String poster_pic;

	public MovieModel() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getDirector_id() {
		return director_id;
	}

	public void setDirector_id(int director_id) {
		this.director_id = director_id;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getPoster_pic() {
		return poster_pic;
	}

	public void setPoster_pic(String poster_pic) {
		this.poster_pic = poster_pic;
	}

}
