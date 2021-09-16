package com.spring.wefit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.wefit.noticeboard.dao.NoticeBoardDAO;
import com.spring.wefit.command.NoticeBoardVO;
import com.spring.wefit.service.NoticeBoardService;

@Controller
@RequestMapping("/noticeboard/*")

public class NoticeBoardController {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void getList() throws Exception {
	  
	   
	 }
	
	

}
