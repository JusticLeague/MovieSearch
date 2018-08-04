package com.movie.user.signUp;

import org.apache.ibatis.annotations.Insert;

import com.movie.user.User;

public interface SignUpMapper {
	
	@Insert("insert into vip(name,phone,password,pic) value(#{name}, #{phone}, #{password}, #{pic}")
	void create(User u);

}
