package com.dong.Board.entity;

import java.util.Date;

public class BoardView extends Board{
	
	private String memberName;
	
	public BoardView() {
		// TODO Auto-generated constructor stub
	}

	public BoardView(int id, String title, String content, Date regdate, int hit, boolean pub, int memberId, String memberName) {
		super(id, title, content, regdate, hit, pub, memberId);
		
		this.memberName=memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "BoardView [memberName=" + memberName + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getRegdate()=" + getRegdate() + ", getHit()=" + getHit()
				+ ", isPub()=" + isPub() + ", getMemberId()=" + getMemberId() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
