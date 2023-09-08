package com.jin.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jin.model.AuthorVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class AuthorServiceTests {
	
	//AuthorService 의존성 주입
	@Autowired
	private AuthorService service;
	
//	@Test
//	public void authorEnrollTest() throws Exception{
//		
//		AuthorVO author = new AuthorVO();
//		
//		author.setAuthorName("테스트");
//		author.setNationId("01");
//		author.setAuthorIntro("테스트 소개");
//		
//		service.authorEnroll(author);
//	}
//	
	
//	@Test
//	public void authorGetListTest() throws Exception{
//		
//		Criteria cri = new Criteria(3,10);		//3페이지 10개 행 표시
//		cri.setKeyword("유홍준");
//		
//		List<AuthorVO> list = service.authorGetList(cri);
//		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println("list" + i + ".............."+ list.get(i));
//		}
//	}
	
	//작가 총 수
//	@Test
//	public void authorGetTotalTest() throws Exception{
//		
//		Criteria cri = new Criteria();
//		cri.setKeyword("유홍준");
//		
//		int total = service.authorGetTotal(cri);
//		
//		System.out.println("total........" + total);
//	}
	
	//작가 상세 페이지
//	@Test
//	public void authorGetDetailTest() throws Exception{
//		
//		int authorId = 1;
//		
//		log.info("author......" + service.authorGetDetail(authorId));
//		
//	}
	
	//작가 정보 수정
//	@Test
//	public void authorModifyTest() throws Exception{
//		
//		AuthorVO author = new AuthorVO();
//		
//		author.setAuthorId(1);
//		System.out.println("수정 전 ........." + service.authorGetDetail(author.getAuthorId()));
//		
//		author.setAuthorName("수정");
//		author.setNationId("01");
//		author.setAuthorIntro("service 소개 수정 하였습니다.");
//		
//		service.authorModify(author);
//		System.out.println("수정 후 ........." + service.authorGetDetail(author.getAuthorId()));
//		
//		
//	}
	



}
