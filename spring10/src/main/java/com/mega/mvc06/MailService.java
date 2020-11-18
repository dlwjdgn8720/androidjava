package com.mega.mvc06;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Aspect
@Service("mail")
public class MailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void mailSend2(JoinPoint joinpoint, Throwable ex) {
		Signature signature = joinpoint.getSignature();
		System.out.println(signature.getName());
		System.out.println(signature.toString());
		
		System.out.println("에러정보:" +ex.getMessage());
		System.out.println("에러가 발생하여 mailSend2메서드가 호출됨 ============");
		String body = signature.toString() + "\n" + "에러정보:" +ex.getMessage();
		try {
			//MIME Message 객체 생성
			MimeMessage message = mailSender.createMimeMessage();
			//messager안에 값을 넣어야 하는데,vo같은 클래스 객체를 만들어서
			//값을 넣어주도록 하자.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message,true,"UTF-8");
			messageHelper.setFrom("dlwjdgn8720@gmail.com");
			messageHelper.setTo("dlwjdgn8720@naver.com");
			messageHelper.setSubject(signature.getName()+"메서드호출로 서버에 문제 발생");
			messageHelper.setText("문제발생!!\n\n"+body);
			mailSender.send(message);
			System.out.println("메일전송");
			
		} catch (Exception e) {
			System.out.println("메일 보내는 중 에러 발생 ..>>>>"+e);
		}
	}
	
	
	
	public void mailSend(HttpServletRequest request) {
		System.out.println(request.getParameter("tomail"));
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		//System.out.println(mailSender);
		
		try {
			//MIME Message 객체 생성
			MimeMessage message = mailSender.createMimeMessage();
			//messager안에 값을 넣어야 하는데,vo같은 클래스 객체를 만들어서
			//값을 넣어주도록 하자.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message,true,"UTF-8");
			messageHelper.setFrom("dlwjdgn8720@gmail.com");
			messageHelper.setTo(request.getParameter("tomail"));
			messageHelper.setSubject(request.getParameter("title"));
			messageHelper.setText(request.getParameter("content"));
			mailSender.send(message);
			System.out.println("메일전송");
			
		} catch (Exception e) {
			System.out.println("메일 보내는 중 에러 발생 ..>>>>"+e);
		}
	}
}
