package com.movie.user.signUp;

import org.springframework.beans.factory.annotation.Autowired;

import com.movie.user.User;

public class SignUpService {
	
	
	@Autowired
	SignUpMapper mapper;
	
	// 添加一个会员
	public void addVip(User user) {
		mapper.create(user);
	}

}
