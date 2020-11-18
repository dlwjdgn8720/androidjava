package com.mega.mvc06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//컨트롤러에서 db로 넘어가기전 / 결과값 가지고 와서
//중간에 처리해야하는 부분: 비지니스 층(business layer) =>컨트롤러에서 처리못하는 부분들을 서비스단으로 넘김(구체적인 작업)
@Service
public class ReplyService {

	@Autowired
	ReplyDAO dao;
	
	public int delete(ReplyVO vo) {
		return dao.delete(vo);
	}
	public int create(ReplyVO vo) {
		return dao.create(vo);
	}
	
	public List<ReplyVO> list(int original) {
		return dao.list(original);
	}
	
	
	
}
