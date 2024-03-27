package com.jdevil.cms.page1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page1")
public class RestfulHomeController {

	
//	@GetMapping("/")  // select 1 person
//	public String getApi() { 
//
//		return "";
//	}
//	
	@GetMapping("/all")  // select all person
	public String allInfoApi() { 

		return "";
	}
	
		
	@PostMapping("/")
	public String saveApi() { //insert

		return "";
	}

	@PutMapping("/")
	public String putApi() { //update

		return "";
	}
	@DeleteMapping("/")
	public String deleteApi() { //delete

		return "";
	}
	
	

}
