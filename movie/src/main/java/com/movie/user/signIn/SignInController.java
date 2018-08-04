package com.movie.user.signIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/signIn")
public class SignInController {

	@Autowired
	SignInService service;

	@PostMapping
	@ResponseBody
	public boolean signIn(@RequestParam(value="phone",required = true) String phone,
			@RequestParam(value="password", required = true) String password) {
		
		// 比较账号和密码
		if(phone.equals(service.phone())){
			if(password.equals(service.password())) {
				
				return true;
			}
		}
		return false;
	}

}
