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
<<<<<<< HEAD
	public String add(User u) {
		service.addVip(u);
		return "redirect:/signIn.html";
=======
	public String add(User user) {
		service.addVip(user);
		return "/signIn.html";
>>>>>>> b363fcd85cc158c9958430e0c3a6e1b1e262ad65
	}
	

}
