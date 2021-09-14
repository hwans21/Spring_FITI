package com.spring.wefit.user.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.wefit.command.UserVO;
import com.spring.wefit.user.mapper.IUserMapper;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserMapper mapper;
	
	@Override
	public int emailCheck(String email) {
		// TODO Auto-generated method stub
		return mapper.emailCheck(email);
	}

	@Override
	public int nickCheck(String nick) {
		// TODO Auto-generated method stub
		return mapper.nickCheck(nick);
	}

	@Override
	public void join(UserVO vo) {
		// TODO Auto-generated method stub
		// 회원 비밀번호 암호화 인코딩
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println("암호화 하기 전: "+vo.getMPasswd());
		//비밀번호를 암호화해서 user객체에 다시 저장하기
		String securePw = encoder.encode(vo.getMPasswd());
		System.out.println("암호화 한 후: "+securePw);
		vo.setMPasswd(securePw);
		UUID uuid = UUID.randomUUID();
		String[] uuids = uuid.toString().split("-");
		vo.setMCode(uuids[0]);
		
		mapper.join(vo);
	}

	@Override
	public UserVO login(String email, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO getInfo(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(UserVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawal(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Timestamp date) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recovery(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keepLogin(String sessionId, Date limitTime, String account) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserVO getUserWithSessionId(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
