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

	@Override
	public void delete(int NBNUM) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseViewcnt(int NBNUM) throws Exception {
		// TODO Auto-generated method stub
		
	}

	}