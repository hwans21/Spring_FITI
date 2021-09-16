package com.spring.wefit.noticeboard.service;

import java.util.List;

import com.spring.wefit.command.NoticeReplyVO;

public interface NoticeReplyService {
	
	// 댓글 조회
	public List<NoticeReplyVO> list(int NRNUM) throws Exception;

	// 댓글 조회
	public void write(NoticeReplyVO vo) throws Exception;

	// 댓글 수정
	public void modify(NoticeReplyVO vo) throws Exception;

	// 댓글 삭제
	public void delete(NoticeReplyVO vo) throws Exception;

}
