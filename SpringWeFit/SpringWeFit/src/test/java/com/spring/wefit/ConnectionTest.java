package com.spring.wefit;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.wefit.command.UserVO;
import com.spring.wefit.user.mapper.IUserMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/db-config.xml")
@Log4j
@WebAppConfiguration
public class ConnectionTest {
	
	@Autowired
	
	private IUserMapper usermapper;
	
	 
	
	@Test
	public void test2() {
		System.out.println(usermapper.emailCheck("test@emi.com"));
	}
	
	@Test
	public void joinTest() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		UserVO vo = new UserVO();
		for(int i=1;i<50;i++) {
			vo.setMEmail("test"+i+"@test.com");
			vo.setMNick("test"+i);
			vo.setMPasswd(encoder.encode(Integer.toString(i)));
			vo.setMPhone("010111111"+(i<10?"0":"")+i);
			vo.setMHumanYN("N");
			vo.setMEmailYN("Y");
			vo.setMCode(UUID.randomUUID().toString().split("-")[0]);
			System.out.println(vo.toString());
			usermapper.join(vo);
		}
	}
}
