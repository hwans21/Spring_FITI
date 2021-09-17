package com.spring.wefit.placeboard.service;

import java.util.List;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.commons.PageVO;

public interface IPlaceBoardService {

	//��� �� ���
	void regist(PlaceBoardVO vo);

	//��� �� ���
	List<PlaceBoardVO> getList(PageVO vo);

	//��� �� �Խù� ��
	int getTotal(PageVO vo);

	//��� �� �󼼺���
	PlaceBoardVO getContent(int pbNum);

	//��� �� ����
	void update(PlaceBoardVO vo);

	//��� �� ����
	void delete(int pbNum);

	
	

}
