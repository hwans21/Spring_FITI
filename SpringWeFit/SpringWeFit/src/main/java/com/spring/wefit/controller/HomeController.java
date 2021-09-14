package com.spring.wefit.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
				
		return "home";
	}
	
	@RequestMapping(value = "/1", method = RequestMethod.GET)
	public String test1() {
				
		return "/board/course/course_board";
	}
	@RequestMapping(value = "/2", method = RequestMethod.GET)
	public String test2() {
				
		return "/board/course/course_detail";
	}
	@RequestMapping(value = "/3", method = RequestMethod.GET)
	public String test3() {
				
		return "/board/course/course_modify";
	}
	@RequestMapping(value = "/4", method = RequestMethod.GET)
	public String test4() {
				
		return "/board/course/course_write";
	}
	@RequestMapping(value = "/5", method = RequestMethod.GET)
	public String test5() {
				
		return "/board/diet/diet_board";
	}
	@RequestMapping(value = "/6", method = RequestMethod.GET)
	public String test6() {
				
		return "/board/diet/diet_detail";
	}
	@RequestMapping(value = "/7", method = RequestMethod.GET)
	public String test7() {
				
		return "/board/diet/diet_modify";
	}
	@RequestMapping(value = "/8", method = RequestMethod.GET)
	public String test8() {
				
		return "/board/diet/diet_write";
	}
	@RequestMapping(value = "/9", method = RequestMethod.GET)
	public String test9() {
				
		return "/board/free/free_board";
	}
	@RequestMapping(value = "/10", method = RequestMethod.GET)
	public String test10() {
				
		return "/board/free/free_detail";
	}
	@RequestMapping(value = "/11", method = RequestMethod.GET)
	public String test11() {
				
		return "/board/free/free_modify";
	}
	@RequestMapping(value = "/12", method = RequestMethod.GET)
	public String test12() {
				
		return "/board/free/free_write";
	}
	@RequestMapping(value = "/13", method = RequestMethod.GET)
	public String test13() {
				
		return "/board/location/loc_board";
	}
	@RequestMapping(value = "/14", method = RequestMethod.GET)
	public String test14() {
				
		return "/board/location/loc_detail";
	}
	@RequestMapping(value = "/15", method = RequestMethod.GET)
	public String test15() {
				
		return "/board/location/loc_modify";
	}
	@RequestMapping(value = "/16", method = RequestMethod.GET)
	public String test16() {
				
		return "/board/location/loc_write";
	}
	@RequestMapping(value = "/17", method = RequestMethod.GET)
	public String test17() {
				
		return "/board/market/market_board";
	}
	@RequestMapping(value = "/18", method = RequestMethod.GET)
	public String test18() {
				
		return "/board/market/market_detail";
	}
	@RequestMapping(value = "/19", method = RequestMethod.GET)
	public String test19() {
				
		return "/board/market/market_modify";
	}
	@RequestMapping(value = "/20", method = RequestMethod.GET)
	public String test20() {
				
		return "/board/market/market_write";
	}
	@RequestMapping(value = "/21", method = RequestMethod.GET)
	public String test21() {
				
		return "/board/notice/notice_board";
	}
	@RequestMapping(value = "/22", method = RequestMethod.GET)
	public String test22() {
				
		return "/board/notice/notice_detail";
	}
	@RequestMapping(value = "/23", method = RequestMethod.GET)
	public String test23() {
				
		return "/board/notice/notice_modify";
	}
	@RequestMapping(value = "/24", method = RequestMethod.GET)
	public String test24() {
				
		return "/board/notice/notice_write";
	}
	@RequestMapping(value = "/25", method = RequestMethod.GET)
	public String test25() {
				
		return "/board/qna/qna_board";
	}
	@RequestMapping(value = "/26", method = RequestMethod.GET)
	public String test26() {
				
		return "/board/qna/qna_detail";
	}
	@RequestMapping(value = "/27", method = RequestMethod.GET)
	public String test27() {
				
		return "/board/qna/qna_modify";
	}
	@RequestMapping(value = "/28", method = RequestMethod.GET)
	public String test28() {
				
		return "/board/qna/qna_write";
	}
	
	@RequestMapping(value = "/29", method = RequestMethod.GET)
	public String test29() {
				
		return "/board/qna/qna";
	}
	@RequestMapping(value = "/30", method = RequestMethod.GET)
	public String test30() {
				
		return "/user/mypage";
	}
	@RequestMapping(value = "/31", method = RequestMethod.GET)
	public String test31() {
				
		return "/user/pwchange";
	}
}