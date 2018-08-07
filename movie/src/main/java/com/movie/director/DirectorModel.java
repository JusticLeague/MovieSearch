package com.movie.director;

/**
 * 导演的名称、性别、生日、国籍、简介、图片
 * 
 * @author QQ546
 *
 */
public class DirectorModel {

	int director_id;
	String director_name;
	int director_sex;
	String director_birth;
	String director_country;
	String director_desc;
	String director_pic;
	
	public DirectorModel() {

	}

	public int getDirector_id() {
		return director_id;
	}

	public void setDirector_id(int director_id) {
		this.director_id = director_id;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public int getDirector_sex() {
		return director_sex;
	}

	public void setDirector_sex(int director_sex) {
		this.director_sex = director_sex;
	}

	public String getDirector_birth() {
		return director_birth;
	}

	public void setDirector_birth(String director_birth) {
		this.director_birth = director_birth;
	}

	public String getDirector_country() {
		return director_country;
	}

	public void setDirector_country(String director_country) {
		this.director_country = director_country;
	}

	public String getDirector_desc() {
		return director_desc;
	}

	public void setDirector_desc(String director_desc) {
		this.director_desc = director_desc;
	}

	public String getDirector_pic() {
		return director_pic;
	}

	public void setDirector_pic(String director_pic) {
		this.director_pic = director_pic;
	}

	

}
