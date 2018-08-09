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
	@GetMapping("/{directorId}")
	@ResponseBody
	public List<DirectorModel> find(@PathVariable int directorId) {
		return service.find(directorId);
	}

	@GetMapping
	@ResponseBody
	public List<DirectorModel> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{directorName}")
	@ResponseBody
	public List<DirectorModel> findByName(@PathVariable String name){
		return service.findByName(name);
	}

	// // 查询导演所有信息
	// @GetMapping
	// public List<DirectorModel> find() {
	// return service.findAll();
	// }

	@PostMapping
	public String create(DirectorModel director) {
		service.create(director);
		return "redirect:/manage2.0.html#/director/add";
	}

	// 添加图片
	@PostMapping("/{directorId}")
	public void addPic(@RequestParam(value = "director_id", required = true) int directorId,
			@RequestParam(value = "director_pic", required = false) String directorPic) {
		service.addPic(directorId, directorPic);
	}

	// 删除
	@DeleteMapping("/{directorId}")
	public void delete(@PathVariable int directorId) {
		service.remove(directorId);
	}

	// 修改
	@PutMapping("/{directorId}")
	public void update(@PathVariable int director_id, @RequestBody DirectorModel director) {
		service.update(director);
	}

}
