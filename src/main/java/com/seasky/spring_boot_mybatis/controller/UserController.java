package com.seasky.spring_boot_mybatis.controller;

import com.seasky.spring_boot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;


	@Autowired
	private UserService userService2;

	/*@RequestMapping("/likeName")
	public List<Demo> likeName(String name){
		*//*
		 * 第一个参数：第几页;
		 * 第二个参数：每页获取的条数.
		 *//*
		PageHelper.startPage(1, 2);
		return demoService.likeName(name);
	}*/
	
	@RequestMapping("/save")
	public void save(){
		userService.save();
	}
	
}
