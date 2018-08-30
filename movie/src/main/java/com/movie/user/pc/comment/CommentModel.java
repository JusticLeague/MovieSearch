package com.movie.user.pc.comment;

/**
 * 评论的id 会员的id 影片的id 评论
 * 
 * @author QQ546
 *
 */
public class CommentModel {

	int cmtId;
	int vipId;
	String vipName;
	String movieName;
	int movieId;
	String cmtComment;

	public CommentModel() {

	}

	public String getVipName() {
		return vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getCmtId() {
		return cmtId;
	}

	public void setCmtId(int cmtId) {
		this.cmtId = cmtId;
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

	public String getCmtComment() {
		return cmtComment;
	}

	public void setCmtComment(String cmtComment) {
		this.cmtComment = cmtComment;
	}

}
