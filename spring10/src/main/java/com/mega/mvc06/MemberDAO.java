package com.mega.mvc06;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public int insert(MemberVO vo) {
		return mybatis.insert("member.create",vo);
	}
	
	public MemberVO select(MemberVO vo) {
		MemberVO vo2 = mybatis.selectOne("member.one",vo);
		return vo2;
	}
	
	public void update(MemberVO vo) {
		mybatis.update("member.update");
	}
	
	public void delete(MemberVO vo) {
		mybatis.delete("member.delete");
	}
	
	public List<MemberVO> list() {
		List<MemberVO> list = mybatis.selectList("member.list");
		return list;
	}

}
