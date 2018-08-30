package com.movie.director;

/**
 * 导演的名称、性别、生日、国籍、简介、图片
 * 
 * @author QQ546
 *
 */
public class DirectorModel {

	int directorId;
	String directorName;
	int directorSex;
	String directorBirthday;
	String directorCountry;
	String directorDesc;
	String directorPic;
	String movieName;

	public DirectorModel() {

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

	public int getDirectorSex() {
		return directorSex;
	}

	public void setDirectorSex(int directorSex) {
		this.directorSex = directorSex;
	}

	public String getDirectorBirth() {
		return directorBirthday;
	}

	public void setDirectorBirth(String directorBirthday) {
		this.directorBirthday = directorBirthday;
	}

	public String getDirectorCountry() {
		return directorCountry;
	}

	public void setDirectorCountry(String directorCountry) {
		this.directorCountry = directorCountry;
	}

	public String getDirectorDesc() {
		return directorDesc;
	}

	public void setDirectorDesc(String directorDesc) {
		this.directorDesc = directorDesc;
	}

	public String getDirectorPic() {
		return directorPic;
	}

	public void setDirectorPic(String directorPic) {
		this.directorPic = directorPic;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
