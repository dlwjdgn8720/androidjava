package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Bean
//@Component 부모클래스!!! (컴포넌트 == bean) => 싱글톤 객체 생성해라 
@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis; //context파일에 만들어짐
	
	public MemberVO one(MemberVO vo) {
		MemberVO vo2 =mybatis.selectOne("member.one", vo); //네임스페이스.id,입력param
		
		return vo2;
	}
	
	public List<MemberVO> list() {
		List<MemberVO> list = mybatis.selectList("member.list");
		return list;
	}
	
	
	public void insert(MemberVO vo) {
		mybatis.insert("member.insert",vo);
	}
	
	public void update(MemberVO vo) {
		mybatis.update("member.update",vo);
	}
	public void delete(MemberVO vo) {
		mybatis.delete("member.delete",vo);
	}
	

}
