package com.movie.user.pc.change;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movie.user.User;

/**
 * 前台对于个人修改信息的部分
 * 
 * @author QQ546
 *
 */
@Controller
@RequestMapping("/change")
public class ChangeController {
	
	@Autowired
	ChangeService service;
	
	@PutMapping("/{id}")
	public void change(
			@PathVariable int id, @RequestBody User u) {
		service.change(u);
	}

}
