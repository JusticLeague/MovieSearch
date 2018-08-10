package com.movie.user.signIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.user.User;

@RestController
@RequestMapping("/signIn")
public class SignInController {

	@Autowired
	SignInService service;
	
	@GetMapping
	@ResponseBody
	public List<User> find(){
		return service.find();
	}

	// 返回登陆的结果
	@PostMapping
	public String signIn(@RequestParam(value = "vip_phone", required = true) String phone,
			@RequestParam(value = "vip_password", required = true) String password) {

		// 比较账号和密码
		// 前端调用时  使用 ${msg}（得用jsp） 直接调用数据 不采用
		if (!phone.equals(service.phone())) {
			return "账号不存在！";
		} else {
			if (password.equals(service.password())) {
				return "登陆成功！";
			} else {
				return "密码错误！";
			}
		}
	}

}
