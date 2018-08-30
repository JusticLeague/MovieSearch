package com.movie.user.signIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.user.User;


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
	
	// 搜索得到id, name, phone
	public List<User> find(String vipName){
		return mapper.find(vipName);
	}
	
	// 得到所有用户
	public List<User> findAll(){
		return mapper.findAll();
	}

}
