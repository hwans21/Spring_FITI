package com.spring.wefit.placeboard.mapper;

import java.util.List;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.util.PageVO;

public interface IPlaceBoardMapper {

	//장소 글 등록
	void regist(PlaceBoardVO vo);

	//장소 글 목록
	List<PlaceBoardVO> getList(PageVO vo);

	//장소 총 게시물 수
	int getTotal(PageVO vo);

	//장소 글 상세보기
	PlaceBoardVO getContent(int pbNum);
	
	//장소 글 수정
	void update(PlaceBoardVO vo);
	
	//장소 글 삭제
	void delete(int pbNum);
	
	
	
	
}
