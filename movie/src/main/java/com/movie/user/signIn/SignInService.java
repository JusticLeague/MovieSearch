package com.movie.user.signIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SignInService {
	
	@Autowired
	SignInMapper mapper;
	
	// 获得账号
	public String phone() {
		
		return mapper.phone();
	}
	
	// 获得密码
	public String password() {
		
		 return mapper.password();
	}

}
