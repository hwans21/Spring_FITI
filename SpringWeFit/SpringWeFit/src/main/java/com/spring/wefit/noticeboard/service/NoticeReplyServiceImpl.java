package com.spring.wefit.noticeboard.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.wefit.command.NoticeReplyVO;
import com.spring.wefit.noticeboard.dao.NoticeReplyDAO;

@Service
public class NoticeReplyServiceImpl implements NoticeReplyService {
	
	@Inject
	private NoticeReplyDAO dao;

	// 댓글 조회
	@Override
	public List<NoticeReplyVO> list(int NRNUM) throws Exception {
	    return dao.list(NRNUM);
	}

	@Override
	public void write(NoticeReplyVO vo) throws Exception {
	    dao.write(vo);
	}

	@Override
	public void modify(NoticeReplyVO vo) throws Exception {
	    dao.modify(vo);
	}

	@Override
	public void delete(NoticeReplyVO vo) throws Exception {
	    dao.delete(vo);
	}

}
