package com.movie.user.signIn;

public class SignInService {
	
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
