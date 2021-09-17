package com.spring.wefit.dietboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.wefit.command.DietBoardVO;
import com.spring.wefit.dietboard.mapper.IDietBoardMapper;
import com.spring.wefit.dietboard.util.DietPageVO;

@Service
public class DietBoardService implements IDietBoardService {

	@Autowired
	private IDietBoardMapper mapper;
	
	@Override
	public void regist(DietBoardVO vo) {
		mapper.regist(vo);
	}

	@Override
	public List<DietBoardVO> getList(DietPageVO vo) {
		return mapper.getList(vo);
	}

	@Override
	public DietBoardVO getContent(int dbNum) {
		return mapper.getContent(dbNum);
	}

	@Override
	public void update(DietBoardVO vo) {
		mapper.update(vo);
	}

	@Override
	public void delete(int dbNum) {
		mapper.delete(dbNum);

	}

	@Override
	public int getTotal(DietPageVO vo) {
		return mapper.getTotal(vo);
	}

}
