package com.spring.wefit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.wefit.command.DietBoardVO;
import com.spring.wefit.dietboard.service.IDietBoardService;

@Controller
@RequestMapping("/dietBoard")
public class DietController {
	
	@Autowired
	private IDietBoardService service;
	
	//글 목록전체보기
	@GetMapping("/dietList") 
	public String dietList(Model model) {
		System.out.println("/board/dietList: GET");
		model.addAttribute("dietList", service.getList());
		return "/board/diet/diet_board";
	}

	//글쓰기 화면 이동처리
	@GetMapping("/dietWrite")
	public String dietWrite() {
		System.out.println("/diet_Write 요청");
		return "/board/diet/diet_write";
	}
	
	//글 등록
	@PostMapping("/dietWrite")
	public String dietWrite(DietBoardVO vo, RedirectAttributes ra) {
		System.out.println("/board/dietWrite: POST");
		service.regist(vo);
		ra.addFlashAttribute("msg", "게시물이 등록되었습니다.");
		return "redirect:/board/diet/diet_write";
	}
	
	//글 상세보기
	@GetMapping("/dietDetail")
	public String dietContent(@RequestParam int dbNum, Model model) {
		System.out.println("/board/dietContent: GET");
		System.out.println("요청된 글 번호: " + dbNum);
		model.addAttribute("dietList", service.getContent(dbNum));
		return "/board/diet/diet_detail";
	}
	
	
	
	
	
	
	
	
}




