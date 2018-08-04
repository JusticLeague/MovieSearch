package com.movie.user.signUp;

import org.apache.ibatis.annotations.Insert;

import com.movie.user.User;

public interface SignUpMapper {
	
	@Insert("insert into vip(name,phone,password,pic) value(name=#{name}, phone=#{phone}, password=#{password}, pic=#{pic}")
	void create(User u);

}
