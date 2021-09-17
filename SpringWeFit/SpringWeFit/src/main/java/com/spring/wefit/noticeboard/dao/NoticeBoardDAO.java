package com.spring.wefit.noticeboard.dao;

import java.util.List;
import com.spring.wefit.command.NoticeBoardVO;

public interface NoticeBoardDAO {
	
	//게시글 전체 목록
	public List<NoticeBoardVO> listAll() throws Exception;
	
	//게시글 작성
	public void noticewrite(NoticeBoardVO vo) throws Exception;
	
	//게시물 조회
	public NoticeBoardVO noticeview(int NBNUM) throws Exception;
	
	//게시물 수정
	public void noticemodify(NoticeBoardVO vo) throws Exception;
	
	// 게시뮬 삭제
	public void noticedelete(int NBNUM) throws Exception;
	
	// 게시물 총 갯수
	public int noticecount() throws Exception;
	
	//게시글 조회 증가
	public void increaseViewcnt(int NBNUM) throws Exception;
	
	// 게시물 목록 + 페이징
	public List noticelistPage(int displayPost, int postNum) throws Exception;
	
	// 게시물 목록 + 페이징 + 검색
	 public List<NoticeBoardVO> noticelistPageSearch(
	   int displayPost, int postNum, String searchType, String keyword) throws Exception;
}
