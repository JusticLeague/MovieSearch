package com.movie.user.pc.collect;

/**
 * 收藏的id 会员的id 影片的id
 * 
 * @author QQ546
 *
 */
public class CollectModel {

	int collectId;
	int vipId;
	int movieId;

	public CollectModel() {

	}

	public int getCollectId() {
		return collectId;
	}

	public void setCollectId(int collectId) {
		this.collectId = collectId;
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

}
