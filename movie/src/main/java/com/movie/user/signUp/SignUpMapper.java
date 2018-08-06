package com.movie.user.signUp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.movie.user.User;

@Mapper
public interface SignUpMapper {
	
	// 数据库vip表中插入数据
<<<<<<< HEAD
	@Insert("insert into vip(vip_name,vip_phone,vip_password,vip_pic) value(#{name}, #{phone}, #{password}, #{pic})")
=======
	@Insert("insert into vip(vip_name,vip_phone,vip_password,vip_pic) value(#{name}, #{phone}, #{password}, #{pic}")
>>>>>>> b363fcd85cc158c9958430e0c3a6e1b1e262ad65
	void create(User user);

}
