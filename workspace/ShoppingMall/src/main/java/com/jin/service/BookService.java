package com.jin.service;

import java.util.List;

import com.jin.model.BookVO;
import com.jin.model.Criteria;

public interface BookService {
	
	//상품 검색
	public List<BookVO> getGoodsList(Criteria cri);
	
	//상품 총 갯수
	public int goodsGetTotal(Criteria cri);

}
