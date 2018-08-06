package com.movie.user.pc.score;

/**
 * 会员id 影片id 会员评分
 * 
 * @author QQ546
 *
 */
public class ScoreModel {

	int vip_id;
	int movie_id;
	double score;
	
	public ScoreModel() {

	}

	public int getVip_id() {
		return vip_id;
	}

	public void setVip_id(int vip_id) {
		this.vip_id = vip_id;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
	
}
