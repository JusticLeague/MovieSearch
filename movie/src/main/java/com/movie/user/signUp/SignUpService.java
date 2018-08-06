package com.movie.user.signUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.user.User;


@Service
public class SignUpService {
	
	
	@Autowired
	SignUpMapper mapper;
	
	// 添加一个会员
	public void addVip(User user) {
		mapper.create(user);
	}

}
