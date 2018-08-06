package com.movie.user.signIn;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SignInMapper {
	
	// 查找账号
	@Select("select vip_phone from vip where vip_phone = #{phone}")
	String phone();

	// 查找密码
	@Select("select vip_password from vip where vip_password = #{password}")
	String password();
}
