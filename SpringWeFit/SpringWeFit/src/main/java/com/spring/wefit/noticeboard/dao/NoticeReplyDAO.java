package com.spring.wefit.noticeboard.dao;

public interface NoticeReplyDAO {
	
		// 댓글 조회
		public List<NoticeReplyVO> list(int NRNUM) throws Exception;

		// 댓글 조회
		public void write(NoticeReplyVO vo) throws Exception;

		// 댓글 수정
		public void modify(NoticeReplyVO vo) throws Exception;

		// 댓글 삭제
		public void delete(NoticeReplyVO vo) throws Exception;


}
