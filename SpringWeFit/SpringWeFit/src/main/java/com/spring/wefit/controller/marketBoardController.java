package com.spring.wefit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.wefit.command.marketBoardVO;
import com.spring.wefit.market.service.IMarketBoardService;

@Controller
@RequestMapping("/marketBoard")
public class marketBoardController {
	
	@Autowired
	private IMarketBoardService service;
	
	//���� �Խ�������
	@GetMapping("/market_board")
	public String marketList(marketBoardVO vo, Model model) {
		
		List<marketBoardVO> list = service.getList();
		model.addAttribute("product", list);
		
		return "/board/market/market_board";
	}
	
	//�� �����������
	@GetMapping("/market_write")
	public String market_write() {
		return "/board/market/market_write";
	}
	
	@PostMapping("/regist")
	public String regist(marketBoardVO vo, RedirectAttributes ra) {
		
		service.regist(vo);
		
		return "redirect:/board/market/market_board";
	}
	
	
	

}