package com.movie.user;

/**
 * 会员的基本信息(头像，名称，账号，密码（MD5加密）)
 * 
 * @author QQ546
 *
 */
public class User {

	int vipId;
	String vipPic;
	String vipName;
	String vipPhone;
	String vipPassword;

	public User() {

	}

	public int getVipId() {
		return vipId;
	}

	public void setVipId(int vipId) {
		this.vipId = vipId;
	}

	public String getVipPic() {
		return vipPic;
	}

	public void setVipPic(String vipPic) {
		this.vipPic = vipPic;
	}

	public String getVipName() {
		return vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public String getVipPhone() {
		return vipPhone;
	}

	public void setVipPhone(String vipPhone) {
		this.vipPhone = vipPhone;
	}

	public String getVipPassword() {
		return vipPassword;
	}

	public void setVipPassword(String vipPassword) {
		this.vipPassword = vipPassword;
	}

}
