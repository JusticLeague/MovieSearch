package com.movie.user.pc.collect;

import java.util.List;

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
	public void remove(int collectId) {
		mapper.remove(collectId);
	}

	// 得到一个用户收藏列表里所有的影片name
	public List<String> getName() {
		return mapper.getName();
	}

	// 得到一个影片的收藏量
	public int numble(int movieId) {
		return mapper.sum(movieId);
	}

}
