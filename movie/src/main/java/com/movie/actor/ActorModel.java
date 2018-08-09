package com.movie.actor;

/**
 * 演员的id，名称，性别，生日，国籍，简介，图片
 * 
 * @author QQ546
 *
 */
public class ActorModel {

	int actorId;
	String actorName;
	int actorSex;
	String actorBirth;
	String actorCountry;
	String actorDesc;
	String actorPic;
	String movieName;

	public ActorModel() {

	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public int getActorSex() {
		return actorSex;
	}

	public void setActorSex(int actorSex) {
		this.actorSex = actorSex;
	}

	public String getActorBirth() {
		return actorBirth;
	}

	public void setActorBirth(String actorBirth) {
		this.actorBirth = actorBirth;
	}

	public String getActorCountry() {
		return actorCountry;
	}

	public void setActorCountry(String actorCountry) {
		this.actorCountry = actorCountry;
	}

	public String getActorDesc() {
		return actorDesc;
	}

	public void setActorDesc(String actorDesc) {
		this.actorDesc = actorDesc;
	}

	public String getActorPic() {
		return actorPic;
	}

	public void setActorPic(String actorPic) {
		this.actorPic = actorPic;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
