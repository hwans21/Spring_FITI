package com.spring.wefit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.wefit.market.service.IMarketBoardService;

@Controller
public class marketBoardController {
	
	@Autowired
	private IMarketBoardService service;

}
