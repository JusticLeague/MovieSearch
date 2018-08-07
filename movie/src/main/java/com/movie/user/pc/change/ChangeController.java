package com.movie.user.pc.change;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movie.user.User;

@Controller
@RequestMapping("/change")
public class ChangeController {
	
	@Autowired
	ChangeService service;
	
	@PutMapping("/{vip_id}")
	public void change(
			@PathVariable int vip_id, User u) {
		service.change(u);
	}

}
