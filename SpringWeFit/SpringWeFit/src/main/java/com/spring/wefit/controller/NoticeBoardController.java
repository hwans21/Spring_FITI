package com.spring.wefit.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.wefit.command.NoticeBoardVO;
import com.spring.wefit.command.NoticeReplyVO;
import com.spring.wefit.noticeboard.service.NoticeBoardService;
import com.spring.wefit.noticeboard.service.NoticeReplyService;
import com.spring.wefit.noticeboard.service.NoticeReplyService;

@Controller
@RequestMapping("/noticeboard/*")
public class NoticeBoardController {

 @Inject
 private NoticeBoardService service;
 
 @Inject
 private NoticeReplyService noticeReplyService;

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
	
	// 댓글 조회
	List<NoticeReplyVO> noticeReply = null;
	noticeReply = noticeReplyService.list(NRNUM);
	model.addAttribute("noticeReply", NoticeReply);

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

//게시물 삭제
@RequestMapping(value = "/noticedelete", method = RequestMethod.GET)
public String getDelete(@RequestParam("NBNUM") int NBNUM) throws Exception {

service.noticedelete(NBNUM);  

return "redirect:/noticeboard/noticelist";
}

//게시물 목록 + 페이징 추가
@RequestMapping(value = "/noticelistpage", method = RequestMethod.GET)
public void getListPage(Model model, @RequestParam("num") int num) throws Exception {
	
	 // 게시물 총 갯수
	 int count = service.count();
	  
	 // 한 페이지에 출력할 게시물 갯수
	 int postNum = 10;
	  
	 // 하단 페이징 번호 ([ 게시물 총 갯수 ÷ 한 페이지에 출력할 갯수 ]의 올림)
	 int pageNum = (int)Math.ceil((double)count/postNum);
	  
	 // 출력할 게시물
	 int displayPost = (num - 1) * postNum;
	    
	 List list = null; 
	 list = service.noticelistPage(displayPost, postNum);
	 model.addAttribute("list", list);   
	 model.addAttribute("pageNum", pageNum);
	
}


}