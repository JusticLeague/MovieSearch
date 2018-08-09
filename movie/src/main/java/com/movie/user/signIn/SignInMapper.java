package com.movie.user.signIn;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SignInMapper {
	
	// 查找账号
	@Select("select vip_phone as vipPhone from vip where vip_phone = #{vipPhone}")
	String phone();

	// 查找密码
	@Select("select vip_password as vipPassword from vip where vip_password = #{vipPassword}")
	String password();
}
