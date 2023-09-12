package com.jin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.mapper.MemberMapper;
import com.jin.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper membermapper;

	//회원 가입 
	@Override
	public void memberJoin(MemberVO member) throws Exception {

		membermapper.memberJoin(member);
		
		
	}
	//아이디 중복 조회
	@Override
	public int idCheck(String memberId) throws Exception {

		return membermapper.idCheck(memberId);
	}
	@Override
	public MemberVO memberLogin(MemberVO member) throws Exception {

		return membermapper.memberLogin(member);
	}
	
	//주문자 정보
	@Override
	public MemberVO getMemberInfo(String memberId) {
		
		return membermapper.getMemberInfo(memberId);
	}

}
