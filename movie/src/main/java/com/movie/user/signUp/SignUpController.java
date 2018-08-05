package com.movie.user.signUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movie.user.User;

/**
 * 注册控制器
 * @author QQ546
 *
 */
@Controller
@RequestMapping("/signUp")
public class SignUpController {
	
	@Autowired
	SignUpService service;
	
	@PostMapping
	public void add(User u) {
		service.addVip(u);
	}
	

}
