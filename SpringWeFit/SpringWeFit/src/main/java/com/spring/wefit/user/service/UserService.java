package com.spring.wefit.user.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.wefit.command.UserVO;
import com.spring.wefit.user.mapper.IUserMapper;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserMapper mapper;
	
	@Autowired
	private JavaMailSender mailSender;


	
	@Override
	public int emailCheck(String email) {
		// TODO Auto-generated method stub
		System.out.println(email);
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
		
		// 이메일 랜덤코드값
		UUID uuid = UUID.randomUUID();
		String[] uuids = uuid.toString().split("-");
		vo.setMCode(uuids[0]);
		
		
		System.out.println(vo.toString());
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
	
	// 인증 이메일 발송
	@Override
	public void mailSendWithUserKey(UserVO vo) {
		
		
		MimeMessage mail = mailSender.createMimeMessage();
		String htmlStr = "<h2>안녕하세요 WeFit입니다!</h2><br><br>" 
				+ "<h3>" + vo.getMNick() + "님</h3>" + "<p>인증하기 버튼을 누르시면 로그인을 하실 수 있습니다 : " 
				+ "<a href='http://localhost/wefit"
				+ "/user/auth/"+vo.getMEmail() +"/"+vo.getMCode()+"'>인증하기</a></p>"
				+ "(혹시 잘못 전달된 메일이라면 이 이메일을 무시하셔도 됩니다)";
		try {
			mail.setSubject("[본인인증] WeFit 인증메일입니다", "utf-8");
			mail.setText(htmlStr, "utf-8", "html");
			mail.addRecipient(RecipientType.TO, new InternetAddress(vo.getMEmail()));
			mailSender.send(mail);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void authUser(String email, String code) {
		
		mapper.authUser(email, code);
	}

}
