package com.spring.wefit.noticeboard.service;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.wefit.noticeboard.dao.NoticeBoardDAO;

import com.spring.wefit.command.NoticeBoardVO;

@Service
public class NoticeBoardServiceImpl implements NoticeBoardService {
	
	@Inject
	 private NoticeBoardDAO dao;
	
	//게시물 목록
	 @Override
	 public List<NoticeBoardVO> list() throws Exception {

	  return dao.list();
	 }

	@Override
	public void write(NoticeBoardVO vo) throws Exception {
		dao.write(vo);	
	}
	
	// 게시물 조회
	@Override
	public NoticeBoardVO noticeview(int NBNUM) throws Exception {

	 return dao.noticeview(NBNUM);
	}
	
	// 게시물 수정
	@Override
	public void noticemodify(NoticeBoardVO vo) throws Exception {
	  
	 dao.noticemodify(vo);
	}

	}


