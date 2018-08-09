package com.movie.manage.movie;

/**
 * 影片的id, name, type, country, score, date, desc, director_id, ratings,
 * dimension, poster_pic
 * 
 * @author QQ546
 *
 */
public class MovieModel {

	int movieId;
	String movieName;
	String movieType;
	String movieCountry;
	double movieScore;
	String movieDate;
	String movieDesc;
	int directorId;
	String directorName;
	String movieRatings;
	int movieDimension;
	String posterPic;

	public MovieModel() {

	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public String getMovieCountry() {
		return movieCountry;
	}

	public void setMovieCountry(String movieCountry) {
		this.movieCountry = movieCountry;
	}

	public double getMovieScore() {
		return movieScore;
	}

	public void setMovieScore(double movieScore) {
		this.movieScore = movieScore;
	}

	public String getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getMovieRatings() {
		return movieRatings;
	}

	public void setMovieRatings(String movieRatings) {
		this.movieRatings = movieRatings;
	}

	public int getMovieDimension() {
		return movieDimension;
	}

	public void setMovieDimension(int movieDimension) {
		this.movieDimension = movieDimension;
	}

	public String getPosterPic() {
		return posterPic;
	}

	public void setPosterPic(String posterPic) {
		this.posterPic = posterPic;
	}

}
