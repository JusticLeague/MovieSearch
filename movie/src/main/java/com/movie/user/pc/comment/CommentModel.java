package com.movie.user.pc.comment;

/**
 * 评论的id 会员的id 影片的id 评论
 * 
 * @author QQ546
 *
 */
public class CommentModel {

	int cmt_id;
	int vip_id;
	int movie_id;
	String cmt_comment;

	public CommentModel() {

	}

	public int getCmt_id() {
		return cmt_id;
	}

	public void setCmt_id(int cmt_id) {
		this.cmt_id = cmt_id;
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

	public String getCmt_comment() {
		return cmt_comment;
	}

	public void setCmt_comment(String cmt_comment) {
		this.cmt_comment = cmt_comment;
	}

}
