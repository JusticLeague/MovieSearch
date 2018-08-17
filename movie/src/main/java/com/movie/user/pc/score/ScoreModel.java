package com.movie.user.pc.score;

/**
 * 会员id 影片id 会员评分
 * 
 * @author QQ546
 *
 */
public class ScoreModel {

	int vipId;
	int movieId;
	double score;
	int number;

	public ScoreModel() {

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getVipId() {
		return vipId;
	}

	public void setVipId(int vipId) {
		this.vipId = vipId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
