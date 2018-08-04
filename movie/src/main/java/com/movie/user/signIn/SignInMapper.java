package com.movie.user.signIn;

import org.apache.ibatis.annotations.Select;

public interface SignInMapper {
	
	// 查找账号
	@Select("select phone from vip where phone = #{phone}")
	String phone();

	// 查找密码
	@Select("select password from vip where password = #{password}")
	String password();
}
