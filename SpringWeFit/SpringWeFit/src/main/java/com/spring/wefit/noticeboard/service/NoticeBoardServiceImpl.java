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
	
	// 게시물 삭제
	public void noticedelete(int NBNUM) throws Exception {
	 dao.noticedelete(NBNUM);
	}
	
	// 게시물 총 갯수
	@Override
	public int noticecount() throws Exception {
	 return dao.noticecount();
	}
	
	// 게시물 목록 + 페이징
	@Override
	public List noticelistPage(int displayPost, int postNum) throws Exception {
	 return dao.noticelistPage(displayPost, postNum);
	}
	
	// 게시물 목록 + 페이징 + 검색
	@Override
	public List<BoardVO> listPageSearch(
	  int displayPost, int postNum, String searchType, String keyword) throws Exception {
	 return  dao.listPageSearch(displayPost, postNum, searchType, keyword);
	}

	@Override
	public List<NoticeBoardVO> noticelistPageSearch(int displayPost, int postNum, String searchType, String keyword)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	}


