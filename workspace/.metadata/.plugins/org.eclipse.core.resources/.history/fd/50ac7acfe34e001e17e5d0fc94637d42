package com.jin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.mapper.AdminMapper;
import com.jin.model.BookVO;
import com.jin.model.CateVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	//상품등록
	@Override
	public void bookEnroll(BookVO book) {

		log.info("(service)bookEnroll.......");
		
		adminMapper.bookEnroll(book);
		
	}
	
	//카테고리 리스트
	@Override
	public List<CateVO> cateList() {
		
		log.info("(service)cateList.........");
		return adminMapper.cateList();
	}
	

}
