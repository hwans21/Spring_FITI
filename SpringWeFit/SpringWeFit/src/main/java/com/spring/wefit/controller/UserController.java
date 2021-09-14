package com.spring.wefit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.wefit.command.UserVO;
import com.spring.wefit.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@PostMapping("/join")
	@ResponseBody
	public String join(@RequestBody UserVO vo) {
		service.join(vo);
		return "JoinSuccess";
		
	}
	
	
	@PostMapping("/emailChk")
	@ResponseBody
	public String emailChk(@RequestBody String email) {
		if(service.emailCheck(email) == 0) {
			return "success";
		}
		return "duplicate";
		
	}
}
