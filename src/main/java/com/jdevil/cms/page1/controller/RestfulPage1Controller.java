package com.jdevil.cms.page1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page1")
public class RestfulPage1Controller {

	// select all person
	@GetMapping("/{userId}")
	public String oneInfoApi(@PathVariable String userId) {

		return "";
	}

	// select all person
	@GetMapping("/all")
	public String allInfoApi() {

		return "";
	}

	// insert
	@PostMapping("/")
	public String saveApi() {

		return "";
	}

	// update
	@PutMapping("/")
	public String putApi() {

		return "";
	}

	// delete
	@DeleteMapping("/")
	public String deleteApi() {

		return "";
	}

}
