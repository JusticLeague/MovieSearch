package com.movie.user.signUp;

import org.springframework.beans.factory.annotation.Autowired;

import com.movie.user.User;

public class SignUpService {
	
	
	@Autowired
	SignUpMapper mapper;
	
	
	public void addVip(User u) {
		mapper.create(u);
	}

}
