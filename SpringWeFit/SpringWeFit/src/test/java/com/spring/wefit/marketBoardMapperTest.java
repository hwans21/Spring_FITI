package com.spring.wefit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.wefit.command.marketBoardVO;
import com.spring.wefit.market.mapper.IMarketBoardMapper;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/file:src/main/webapp/WEB-INF/config/db-config.xml")
public class marketBoardMapperTest {
	
	@Autowired
	private IMarketBoardMapper mapper;
	
	@Test
	public void registTest() {
		for(int i=1; i<30; i++) {
			marketBoardVO vo = new marketBoardVO();
			vo.setMbNum(i);
			vo.setMNum(i);
			vo.setMbType("테스트타입" + i);
			vo.setMbTitle("테스트제목" + i);
			vo.setMbContent("테스트" + i);
			vo.setMbPrice(i);
			vo.setMbAddrBasic("테스트주소" + i);
			vo.setMbAddrDetail("테스트주소상세" + i);
			vo.setMbLatitude(i);
			vo.setMbLongitude(i);
			vo.setMbLookCount(i);
			vo.setMbImage1("테스트" + i);
			vo.setMbRealImage1("테스트" + i);
			mapper.regist(vo);
			
		}
	}

}
