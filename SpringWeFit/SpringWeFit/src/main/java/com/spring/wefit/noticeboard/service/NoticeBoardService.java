package com.spring.wefit.noticeboard.service;

import java.util.List;

import com.spring.wefit.command.NoticeBoardVO;

public interface NoticeBoardService {
	
	//게시물 목록
	 public List<NoticeBoardVO> list() throws Exception;
	 
	 //게시물 작성
	 public void write(NoticeBoardVO vo) throws Exception;

	// 게시물 조회
	 public NoticeBoardVO noticeview(int NBNUM) throws Exception;
	 
	// 게시물 수정
	 public void noticemodify(NoticeBoardVO vo) throws Exception;
	

}
