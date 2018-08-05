package com.movie.user.signUp;

import org.apache.ibatis.annotations.Insert;

import com.movie.user.User;

public interface SignUpMapper {
	
	// 数据库vip表中插入数据
	@Insert("insert into vip(name,phone,password,pic) value(#{name}, #{phone}, #{password}, #{pic}")
	void create(User u);

}
