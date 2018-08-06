package com.movie.user.signIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/signIn")
public class SignInController {

	@Autowired
	SignInService service;

	@PostMapping
	public String signIn(@RequestParam(value = "phone", required = true) String phone,
			@RequestParam(value = "password", required = true) String password, ModelMap model) {

		// 比较账号和密码
		// 前端调用时  使用 ${msg} 直接调用数据
//		if (!phone.equals(service.phone())) {
//			model.addAttribute("msg", "账号不存在！");
//		} else {
//			if (password.equals(service.password())) {
//				model.addAttribute("msg", "登陆成功！");
//			} else {
//				model.addAttribute("msg", "密码错误！");
//			}
//		}
		return "redirect:/vip.html";
	}

}
