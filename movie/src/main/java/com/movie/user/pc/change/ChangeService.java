package com.movie.user.pc.change;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.user.User;

@Service
public class ChangeService {

	@Autowired
	ChangeMapper mapper;

	// 修改信息
	public void change(User u) {
		mapper.change(u);
	}

}
