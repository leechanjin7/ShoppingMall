package com.jin.controller;

import java.util.Random;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jin.model.MemberVO;
import com.jin.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping(value = "/member")
@Log4j
public class MemberController {

	@Autowired
	private MemberService memberservice;

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private BCryptPasswordEncoder pwEncoder;

	// 회원가입 페이지 이동
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void loginGET() {

		log.info("회원가입 페이지 진입");

	}

	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinPOST(MemberVO member) throws Exception {
		
		String rawPw = "";				//인코딩 전 비밀번호
		String encodePw = "";			//인코딩 후 비밀번호
		
		rawPw = member.getMemberPw();		//비밀번호 데이터 얻음
		encodePw = pwEncoder.encode(rawPw);	//비밀번호 인코딩
		member.setMemberPw(encodePw);		//인코딩된 비밀번호 member객체에 다시 저장
		
		//회원가입 쿼리 실행
		memberservice.memberJoin(member);

		return "redirect:/main";
	}

	// 로그인 페이지 이동
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void joinGET() {

		log.info("로그인 페이지 진입");

	}

	// 아이디 중복검사
	@RequestMapping(value = "/memberIdChk", method = RequestMethod.POST)
	@ResponseBody
	public String memberIdChkPOST(String memberId) throws Exception {

		// log.info("memberIdChk() 진입");

		int result = memberservice.idCheck(memberId);

		// log.info("결과값 = " + result);

		if (result != 0) {
			return "fail"; // 중복아이디가 존재
		} else {
			return "success"; // 중복 아이디 x
		}
	}

	// 이메일 인증
	@RequestMapping(value = "/mailCheck", method = RequestMethod.GET)
	@ResponseBody
	public String mailCheckGET(String email) throws Exception {

		// 뷰(View)로부터 넘어온 데이터 확인
		log.info("이메일 데이터 전송 확인");
		log.info("인증번호 : " + email);

		// 인증번호(난수) 생성
		Random random = new Random();
		int checkNum = random.nextInt(888888) + 1111111;
		log.info("인증번호 " + checkNum);

		// 이메일 보내기
		String setFrom = "chanjini7@naver.com";
		String toMail = email;
		String title = "회원가입 인증 이메일 입니다.";
		String content = "홈페이지를 방문해주셔서 감사합니다." + "<br><br>" + "인증번호는 : " + checkNum + "입니다." + "<br>"
				+ "해당 인증번호를 인증번호 확인란에 기입하여 주세요.";
		try {

			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
			helper.setFrom(setFrom);
			helper.setTo(toMail);
			helper.setSubject(title);
			helper.setText(content, true);
			mailSender.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String num = Integer.toString(checkNum);
		
		return num;
	}
	
	//로그인
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String loginPOST(HttpServletRequest request, MemberVO member, RedirectAttributes rttr) throws Exception{
		
//		System.out.println("login 메서드 진입");
//		System.out.println("전달된 데이터 : " + member);
		
		HttpSession session = request.getSession();
		MemberVO lvo = memberservice.memberLogin(member);
		
		// lvo 값은 아이디, 비밀번호가 존재할 경우 memberId, memberName, adminCk, money, point 데이터가 담긴 
		//MemberVO 객체가 저장되게 됩니다. 아이디, 비밀번호가 존재하지 않을 경우 lvo값은 null 이 저장됩니다. 
		//따라서 이러한 상황을 이용해서 if문을 통해 lvo 값이 null일 경우 로그인 실패이기 때문에 로그인 페이지로 리다이렉트 되도록,
		//null이 아닌 경우 로그인 성공이기 때문에 메인 페이지로 리다이렉트 되도록 return 값을 설정해줍니다
		
		if(lvo == null) {								//일치하지 않는 아이디, 비밀번호 입력경우
			int result = 0;
			rttr.addFlashAttribute("result", result);
			return "redirect:/member/login";
		}
		
		session.setAttribute("member", lvo);			//일치하는 아이디, 비밀번호 경우(로그인 성공)
		
		return "redirect:/main";
	}
	

}
