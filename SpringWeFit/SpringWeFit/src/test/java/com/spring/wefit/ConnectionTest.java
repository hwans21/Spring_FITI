package com.spring.wefit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.wefit.test.ITestMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/db-config.xml")
@Log4j
@WebAppConfiguration
public class ConnectionTest {
	
	@Autowired
	private ITestMapper mapper;
	
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

	@Test
	public void test(){
		double d = (double) mapper.test();
		System.out.println(d);

	}
}
