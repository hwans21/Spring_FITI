package com.spring.wefit.market.service;

import java.util.List;

import com.spring.wefit.command.marketBoardVO;

public interface IMarketBoardService {
	
	//�� ���
	void regist(marketBoardVO vo);
	
	//�� ���
	List<marketBoardVO> getList();
	
	//�� �Խù� ��
	int getTotal();
	
	//�󼼺���
	marketBoardVO getContent(int mbNum);
	
	//����
	void update(marketBoardVO vo);
	
	//����
	void delete(int mbNum);

}
