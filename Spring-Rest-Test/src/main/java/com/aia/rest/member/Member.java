package com.aia.rest.member;

import java.util.Date;

public class Member {

	private int idx;
	private String uid;
	private String upw;
	private String uname;
	private Date regdate;


	public Member(int idx, String uid, String upw, String uname, Date regdate) {
		this.idx = idx;
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.regdate = regdate;

	}
	
	// MemberRegRequest -> Member 왜? why? 이유가 뭐지? 
	public Member(String uid, String upw, String uname) {
		this(0, uid, upw, uname, null);
	}

	public Member() {
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	




}
