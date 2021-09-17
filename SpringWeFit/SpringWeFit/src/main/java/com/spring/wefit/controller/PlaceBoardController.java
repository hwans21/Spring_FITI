package com.spring.wefit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.commons.PageCreator;
import com.spring.wefit.commons.PageVO;
import com.spring.wefit.placeboard.service.IPlaceBoardService;

@Controller
@RequestMapping("/placeBoard")
public class PlaceBoardController {

	@Autowired 
	private IPlaceBoardService service;
	
	//��� ��� ȭ��
	@GetMapping("/placeList")
	public String placeList(PageVO vo, Model model) {
		System.out.println("/placeBoard/placeList: GET");
		List<PlaceBoardVO> list = service.getList(vo);
		System.out.println(list);
		model.addAttribute("placeList", list);
		return "/board/location/loc_board";
	}
	
		
	//�۾��� ȭ�� ó��
	@GetMapping("/placeWrite")
	public String placeWrite() {
		System.out.println("/placeBoard/placeWrite: GET");
		return "/board/location/loc_write";
	}
	

	//�� ��� ó��
	@PostMapping("/placeWrite")
	public String placeWrite(MultipartHttpServletRequest request,  PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/placeBoard/placeWrite: POST");
		System.out.println("����: " + request.getParameter("pbTitle"));
		System.out.println("����: " + request.getParameter("pbContent"));
		System.out.println(vo);
		service.regist(vo);
		ra.addFlashAttribute("msg", "���� ��� ó���Ǿ����ϴ�.");
			
		return "redirect:/board/location/loc_board"; //��� �Ŀ� �� ��� ��û���� �����̷�Ʈ
	}


	//�� �󼼺��� ó��
	@GetMapping("/placeDetail")
	public String placeContent(@RequestParam int pbNum, Model model) {
		System.out.println("/placeBoard/placeContent: GET");
		System.out.println("��û�� �� ��ȣ: " + pbNum);
		
		model.addAttribute("placeList", service.getContent(pbNum));
		return "board/location/loc_detail";
	}
		
			
	//�� ���� ������ �̵�
	@GetMapping("/placeModify")
	public void modify(@RequestParam int pbNum, Model model) {
		System.out.println("/placeBoard/placeModify: GET");
		System.out.println("��û�� �� ��ȣ: " + pbNum);
		
		model.addAttribute("placeList", service.getContent(pbNum));
	}
		
	//�� ���� ó��
	@PostMapping("/placeUpdate")
	public String placeUpdate(PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/placeBoard/placeUpdate: POST");
		service.update(vo);
		ra.addFlashAttribute("msg", "���� ���� ó���Ǿ����ϴ�.");
			
		return "redirect:/location/loc_detail?pbNum=" + vo.getPbNum();
	}
	
	//�� ���� ó��
	@PostMapping("/placeDelete")
	public String placeDelete(PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/placeBoard/placeUpdate: POST");
		service.delete(vo.getPbNum());
		ra.addFlashAttribute("msg", "�Խñ��� ���� �����Ǿ����ϴ�.");
			
		return "redirect:/board/location/loc_board";
	}	
		
	
	
	
}
