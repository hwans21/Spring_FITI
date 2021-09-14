package com.spring.wefit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.wefit.test.ITestMapper;
import com.spring.wefit.user.mapper.IUserMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/db-config.xml")
@Log4j
@WebAppConfiguration
public class ConnectionTest {
	
	@Autowired
	private ITestMapper mapper;
	private IUserMapper mapper2;
	
	@Test
	public void test(){
		double d = (double) mapper.test();
		System.out.println(d);
	}
	
	@Test
	public void test2() {
		System.out.println(mapper2.emailCheck("test@emi.com"));
	}
}
