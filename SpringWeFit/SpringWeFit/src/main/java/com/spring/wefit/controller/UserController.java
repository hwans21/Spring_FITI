package com.spring.wefit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.wefit.command.UserVO;
import com.spring.wefit.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@PostMapping("/join")
	public String join(UserVO vo,RedirectAttributes ra) {
		System.out.println("회원가입 컨트롤러 요청"+vo.toString());
		service.join(vo);
		ra.addFlashAttribute("msg","메일함을 확인해주세요");
		return "redirect:/";
	}
	
	
	@PostMapping("/emailChk")
	@ResponseBody
	public String emailChk(@RequestBody String email) {
		System.out.println(service.emailCheck(email));
		if((service.emailCheck(email) == 0)) {
			return "success";
		}
		return "duplicate";
	}
	
	@PostMapping("/nickChk")
	@ResponseBody
	public String nickChk(@RequestBody String nick) {
		if(service.nickCheck(nick) == 0) {
			return "success";
		}
		return "duplicate";
		
	}
	
	
}
