package com.movie.user.pc.collect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectService {
	
	@Autowired
	CollectMapper mapper;

	// 添加
	public void create(CollectModel collect) {
		mapper.create(collect);
	}
	
	// 删除
	public void remove(int id) {
		mapper.remove(id);
	}
	
}
