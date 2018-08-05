package com.movie.user.pc.change;

import org.apache.ibatis.annotations.Update;

import com.movie.user.User;

/**
 * 对会员的头像，名称，密码进行修改
 * @author QQ546
 *
 */
public interface ChangeMapper {
	
	@Update("update vip set name = #{name}, pic = #{pic}, password = #{password} where id = #{id}")
	public void change(User u);
	
}
