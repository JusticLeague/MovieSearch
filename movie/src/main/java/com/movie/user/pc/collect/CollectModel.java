package com.movie.user.pc.collect;

/**
 * 收藏的id 会员的id 影片的id
 * 
 * @author QQ546
 *
 */
public class CollectModel {

	int id;
	int vip_id;
	int movie_id;

	public CollectModel() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
