package com.dong.Board.entity;


public class Member {
	
	private int id;
	
	private String name;
	
	private String pwd;
	
	private String email;
	
	private Role role;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int id, String name, String pwd, String email, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", pwd=" + pwd + ", email=" + email + ", role=" + role + "]";
	}
	

}
