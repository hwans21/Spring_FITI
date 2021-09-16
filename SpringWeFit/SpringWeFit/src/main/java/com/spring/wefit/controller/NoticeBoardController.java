package com.spring.wefit.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.wefit.noticeboard.dao.NoticeBoardDAO;
import com.spring.wefit.command.NoticeBoardVO;
import com.spring.wefit.noticeboard.service.NoticeBoardService;

@Controller
@RequestMapping("/noticeboard/*")
public class NoticeBoardController {

 @Inject
 private NoticeBoardService service;

 //게시물 목록
 @RequestMapping(value = "/noticelist", method = RequestMethod.GET)
 public void getList(Model model) throws Exception {
  
  List<NoticeBoardVO> list = null;
  list = service.list();
  model.addAttribute("noticelist", list);
 }
 
 //게시물 작성
 @RequestMapping(value = "/noticewrite", method = RequestMethod.GET)
 public void getWrite() throws Exception {
    
 }
 
 //게시물 작성
 @RequestMapping(value = "/noticewrite", method = RequestMethod.POST)
 Public String postWrite(NoticeBoardVO vo) throws Exception {
	 service.write(vo);

	 return "redirect:/noticeboard/noticelist";
}
 
//게시물 조회
@RequestMapping(value = "/noticeview", method = RequestMethod.GET)
public void getView(@RequestParam("NBNUM") int NBNUM, Model model) throws Exception {
	
	NoticeBoardVO vo = service.noticeview(NBNUM);
	
	model.addAttribute("noticeview", vo);

}

//게시물 수정
@RequestMapping(value = "/noticemodify", method = RequestMethod.GET)
public void getModify(@RequestParam("NBNUM") int NBNUM, Model model) throws Exception {

NoticeBoardVO vo = service.view(NBNUM);

model.addAttribute("noticeview", vo);
}
 
//게시물 수정
@RequestMapping(value = "/noticemodify", method = RequestMethod.POST)
public String postModify(NoticeBoardVO vo) throws Exception {

service.noticemodify(vo);

return "redirect:/noticeboard/noticeview?NBNUM=" + vo.getNBNUM();
}

}