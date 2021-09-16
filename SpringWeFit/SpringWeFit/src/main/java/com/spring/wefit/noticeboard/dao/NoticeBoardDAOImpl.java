package com.spring.wefit.noticeboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.wefit.command.NoticeBoardVO;

@Repository

public class NoticeBoardDAOImpl implements NoticeBoardDAO {

	@Inject
	 private SqlSession sql;
	 
	 private static String namespace = "com.spring.wefit.noticeboard.mappers.noticeboard";
	 		
	 // 게시물 목록
	 @Override
	 public List<NoticeBoardVO> list() throws Exception { 
	  
	  return sql.selectList(namespace + ".noticelist");
	 }

	//게시물 작성
	@Override
	public void noticewrite(NoticeBoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	// 게시물 조회
	@Override
	public NoticeBoardVO noticeview(int NBNUM) throws Exception {
	 
	 return sql.selectOne(namespace + ".noticeview", NBNUM);
	}

	// 게시물 수정
	@Override
	public void noticemodify(NoticeBoardVO vo) throws Exception {
	 sql.update(namespace + ".noticemodify", vo);
	}

	// 게시물 삭제
	public void noticedelete(int NBNUM) throws Exception {
	 sql.delete(namespace + ".noticedelete", NBNUM);
	}
	
	// 게시물 총 갯수
	@Override
	public int noticecount() throws Exception {
	 return sql.selectOne(namespace + ".noticecount"); 
	}
	
	// 게시물 목록 + 페이징
	@Override
	public List noticelistPage(int displayPost, int postNum) throws Exception {

	 HashMap data = new HashMap();
	  
	 data.put("displayPost", displayPost);
	 data.put("postNum", postNum);
	  
	 return sql.selectList(namespace + ".noticelistPage", data);
	}
	
	// 게시물 목록 + 페이징 + 검색
	 @Override
	 public List<NoticeBoardVO> noticelistPageSearch(
	   int displayPost, int postNum, String searchType, String keyword) throws Exception {

	  HashMap<String, Object> data = new HashMap<String, Object>();
	  
	  data.put("displayPost", displayPost);
	  data.put("postNum", postNum);
	  
	  data.put("searchType", searchType);
	  data.put("keyword", keyword);
	  
	  return sql.selectList(namespace + ".noticelistPageSearch", data);
	 }

	@Override
	public void increaseViewcnt(int NBNUM) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NoticeBoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	}