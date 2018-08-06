package com.movie.user;

/**
 * 会员的基本信息(头像，名称，账号，密码（MD5加密）)
 * @author QQ546
 *
 */
public class User {

	int id;
	String pic;
	String name;
	String phone;
	String password;
	
	public User() {

	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
