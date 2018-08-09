package com.movie.director;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	DirectorService service;
	
	// 得到视图
	@GetMapping("/{director_id}")
	@ResponseBody
	public List<DirectorModel> find(@PathVariable int director_id){
		return service.find(director_id);
	}

//	// 查询导演所有信息
//	@GetMapping
//	public List<DirectorModel> find() {
//		return service.findAll();
//	}

	@PostMapping
	public String create(DirectorModel director) {
		service.create(director);
		return "redirect:/manage.html";
	}

	// 添加图片
	@PostMapping("/{director_id}")
	public void addPic(@RequestParam(value = "director_id", required = true) int director_id,
			@RequestParam(value = "director_pic", required = false) String director_pic) {
		service.addPic(director_id, director_pic);
	}

	// 删除
	@DeleteMapping("/{director_id}")
	public void delete(@PathVariable int director_id) {
		service.remove(director_id);
	}

	// 修改
	@PutMapping("/{director_id}")
	public void update(@PathVariable int director_id, @RequestBody DirectorModel director) {
		service.update(director);
	}

}
