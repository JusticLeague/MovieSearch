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

	// 视图director_info 通过id
	@GetMapping("/id/{directorId}")
	@ResponseBody
	public List<DirectorModel> find(@PathVariable int directorId) {
		return service.find(directorId);
	}

	// 视图director_info
	@GetMapping
	@ResponseBody
	public List<DirectorModel> findAll() {
		return service.findAll();
	}

	
	// 表director 通过name
	@GetMapping("/name/{directorName}")
	@ResponseBody
	public List<DirectorModel> findByName(@PathVariable String directorName) {
		return service.findByName(directorName);
	}

	// 表director 查询基本信息
	@GetMapping("/base")
	public List<DirectorModel> findBase() {
		return service.findBase();
	}

	@PostMapping
	public String create(DirectorModel director) {
		service.create(director);
		return "redirect:/manage2.0.html#/director/add";
	}

	// 添加图片
	@PostMapping("/{directorName}")
	public void addPic(@PathVariable String directorName,
			@RequestParam(value = "directorPic", required = false) String directorPic) {
		
		service.addPic(service.getId(directorName), directorPic);
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
