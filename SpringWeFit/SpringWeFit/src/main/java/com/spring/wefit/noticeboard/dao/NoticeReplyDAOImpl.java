package com.spring.wefit.noticeboard.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public class NoticeReplyDAOImpl implements NoticeReplyDAO {
	
	
	@Inject
	private SqlSession sql;

	private static String namespace = "com.spring.wefit.noticeboard.mappers.noticereply";

	// 댓글 조회
	@Override
	public List<NoticeReplyVO> list(int NRNUM) throws Exception {
	    return sql.selectList(namespace + ".noticeReplyList", NRNUM);
	}

	// 댓글 작성
	@Override
	public void write(NoticeReplyVO vo) throws Exception {
	    sql.insert(namespace + ".noticeReplyWrite", vo);
	}

	// 댓글 수정
	@Override
	public void modify(NoticeReplyVO vo) throws Exception {
	    sql.update(namespace + ".noticeReplyModify", vo);
	}

	// 댓글 삭제
	@Override
	public void delete(NoticeReplyVO vo) throws Exception {
	    sql.delete(namespace + ".noticeReplyDelete", vo);
	}


}
