package com.dong.Board.dao;

import org.apache.ibatis.annotations.Mapper;

import com.dong.Board.entity.Member;

@Mapper
public interface MemberDao {
	
	/* public void loginCheck(Member member); */
	
	public Member findByEmail(String email);
}
