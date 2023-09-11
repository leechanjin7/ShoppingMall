package com.jin.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.mapper.BookMapper;
import com.jin.model.BookVO;
import com.jin.model.Criteria;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper bookMapper;

	//상품 검색
	@Override
	public List<BookVO> getGoodsList(Criteria cri) {
		log.info("getGoodsList().........");
		return bookMapper.getGoodsList(cri);
	}

	//상품 총 갯수
	@Override
	public int goodsGetTotal(Criteria cri) {
		log.info("getGoodsTotal().........");
		return bookMapper.goodsGetTotal(cri);
	}

}
