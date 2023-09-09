package com.jin.mapper;

import java.util.List;

import com.jin.model.AuthorVO;
import com.jin.model.Criteria;

//mapper 패키지는 쿼리를 실해앟는 메서드 작성

public interface AuthorMapper {
	
	//작가등록
	public void authorEnroll(AuthorVO author);
	
	//작가 목록
	public List<AuthorVO> authorGetList(Criteria cri);
	
	//작가 총 수
	public int authorGetTotal(Criteria cri);
	
	//작가 상세
	public AuthorVO authorGetDetail(int authorId);
	
	//작가 정보 수정
	public int authorModify(AuthorVO author);
	
	//작가 정보 삭제
	public int authorDelete(int authorId);

}
