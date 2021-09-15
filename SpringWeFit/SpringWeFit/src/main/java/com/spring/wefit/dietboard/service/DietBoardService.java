package com.spring.wefit.dietboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.wefit.command.DietBoardVO;
import com.spring.wefit.dietboard.mapper.IDietBoardMapper;

@Service
public class DietBoardService implements IDietBoardService {

	@Autowired
	private IDietBoardMapper mapper;
	
	@Override
	public void regist(DietBoardVO vo) {
		mapper.regist(vo);
	}

	@Override
	public List<DietBoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public DietBoardVO getContent(int dbNum) {
		return mapper.getContent(dbNum);
	}

	@Override
	public void update(DietBoardVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int dbNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
