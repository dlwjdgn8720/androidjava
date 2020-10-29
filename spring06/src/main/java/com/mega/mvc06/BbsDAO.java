package com.mega.mvc06;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(BbsVO vo) {
		mybatis.insert("bbs.create",vo);
	}
	
	public BbsVO select(BbsVO vo) {
		BbsVO vo2 = mybatis.selectOne("bbs.one",vo);
		return vo2;
	}
	
	public void update(BbsVO vo) {
		mybatis.update("bbs.update");
	}
	
	public void delete(BbsVO vo) {
		mybatis.delete("bbs.delete");
	}
	
	public List<BbsVO> list() {
		List<BbsVO> list = mybatis.selectList("bbs.list");
		return list;
	}

}
