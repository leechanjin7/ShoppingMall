package com.jin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.mapper.AuthorMapper;
import com.jin.model.AuthorVO;
import com.jin.model.Criteria;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	AuthorMapper authorMapper;

	//작가 등록
	@Override
	public void authorEnroll(AuthorVO author) throws Exception {
		
		authorMapper.authorEnroll(author);
		
	}
	
	//작가 목록
	@Override
	public List<AuthorVO> authorGetList(Criteria cri) throws Exception {

		log.info("(service)authorGetList()...." + cri);
		return authorMapper.authorGetList(cri);
	}
	
	//작가 총수
	@Override
	public int authorGetTotal(Criteria cri) throws Exception {
		
		log.info("(service)authorGetTotal()......"+ cri);
		return authorMapper.authorGetTotal(cri);
	}

	//작가 상세 페이지
	@Override
	public AuthorVO authorGetDetail(int authorId) throws Exception {
		
		log.info("authorGetDetail......" + authorId);
		return authorMapper.authorGetDetail(authorId)
				;
	}

	//작가 정보 수정
	@Override
	public int authorModify(AuthorVO author) throws Exception {

		log.info("(service) authorModify......" + author);
		return authorMapper.authorModify(author);
	}

	//작가 정보 삭제
	@Override
	public int authorDelete(int authorId) {
		log.info("authorDelete..........");
		return authorMapper.authorDelete(authorId);
	}

}
