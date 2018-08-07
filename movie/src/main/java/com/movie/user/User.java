package com.movie.user;

/**
 * 会员的基本信息(头像，名称，账号，密码（MD5加密）)
 * 
 * @author QQ546
 *
 */
public class User {

	int vip_id;
	String vip_pic;
	String vip_name;
	String vip_phone;
	String vip_password;

	public User() {

	}

	public int getVip_id() {
		return vip_id;
	}

	public void setVip_id(int vip_id) {
		this.vip_id = vip_id;
	}

	public String getVip_pic() {
		return vip_pic;
	}

	public void setVip_pic(String vip_pic) {
		this.vip_pic = vip_pic;
	}

	public String getVip_name() {
		return vip_name;
	}

	public void setVip_name(String vip_name) {
		this.vip_name = vip_name;
	}

	public String getVip_phone() {
		return vip_phone;
	}

	public void setVip_phone(String vip_phone) {
		this.vip_phone = vip_phone;
	}

	public String getVip_password() {
		return vip_password;
	}

	public void setVip_password(String vip_password) {
		this.vip_password = vip_password;
	}

}
