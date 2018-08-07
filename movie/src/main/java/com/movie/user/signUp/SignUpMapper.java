package com.movie.user.signUp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.movie.user.User;

@Mapper
public interface SignUpMapper {
	
	// 数据库vip表中插入数据
	@Insert("insert into vip(vip_name,vip_phone,vip_password,vip_pic) value(#{vip_name}, #{vip_phone}, #{vip_password}, #{vip_pic}")
	void create(User user);

}
