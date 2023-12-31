package com.jin.persistence;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MailTestController {
	
	@Autowired
	private JavaMailSender mailSender;
	
	//MimeMessage 객체를 직접 생성하여 메일을 발송하는 방법
	@Test
	public void mailSendTest() throws Exception{
			
			String subject = "test 메일";
			String content = "메일 테스트 내용" + "<img src=\"https://t1.daumcdn.net/cfile/tistory/214DCD42594CC40625\">";
			String from = "chanjini7@naver.com";
			String to = "chanjini7@naver.com";
			
			try {
				MimeMessage mail = mailSender.createMimeMessage();
				MimeMessageHelper mailHelper = new MimeMessageHelper(mail,true,"UTF-8");
				//true는 멀티파트 메세지를 사용하겠다는 의미
				
				//단순한 텍스트 메세지만 사용시엔 아래도 가능
				//MimeMessageHelper mailHelper = new MimeMessageHelper(mail,"UTF-8");
				
				mailHelper.setFrom(from);
				//빈에 아이디 설정한 것은 단순히 smtp인증을 받기 위해 사용. 따라서 보내는이(setFrom())이 반드시 필요하다
				//보내는이와 메일주소를 수신하는이가 볼때 모두 표기 되게 원한다면 아래코드
				//mailHelper.setFrom("보내는이 이름 <보내는이 아이디@도메인주소>");
				mailHelper.setTo(to);
				mailHelper.setSubject(subject);
				mailHelper.setText(content, true);
				//true는 html을 사용하겠다는 의미
				
				//단순한 텍스트사용만 원한다면
				//mailHelper.setText(content);
				
				FileSystemResource file = new FileSystemResource(new File("D:\\test.txt"));
				mailHelper.addAttachment("test.txt",file);
				
				mailSender.send(mail);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		
		//MimeMessagePreparator 방법
//	    @RequestMapping(value = "/sendMail", method = RequestMethod.GET)
//	    public void sendMailTest2() throws Exception{
	// 
//	        String subject = "test 메일";
//	        String content = "메일 테스트 내용.";
//	        String from = "보내는이 아이디@도메인주소";
//	        String to = "받는이 아이디@도메인주소";
//	        
//	        
//	        final MimeMessagePreparator preparator = new MimeMessagePreparator() {
//	            
//	            public void prepare(MimeMessage mimeMessage) throws Exception{
//	                final MimeMessageHelper mailHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
//	                
//	                mailHelper.setFrom(from);
//	                mailHelper.setTo(to);
//	                mailHelper.setSubject(subject);
//	                mailHelper.setText(content, true);
	// 
//	            }
//	            
//	        };
//	        
//	        try {    
//	            mailSender.send(preparator);
//	            
//	        } catch(Exception e) {
//	            e.printStackTrace();
//	        }        
//	        
//	    }


}
