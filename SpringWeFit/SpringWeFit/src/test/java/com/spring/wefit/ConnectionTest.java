package com.spring.wefit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.wefit.command.DietBoardVO;
import com.spring.wefit.dietboard.mapper.IDietBoardMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/db-config.xml")
@WebAppConfiguration
public class ConnectionTest {
	
	@Autowired
	private IDietBoardMapper mapper;
	
	@Test
	public void registTest() {
		for(int i=1; i<=10; i++) {
			DietBoardVO vo = new DietBoardVO();
			vo.setMemberNum(i);
			vo.setDbTitle("����" + i);
			vo.setDbContent("����" + i);
			vo.setDbLookCount(i);
			vo.setDbImageCount(i);
			
			mapper.regist(vo);
		}
	}
}








