package com.weovercome.model;

import org.springframework.web.multipart.MultipartFile;

public class MemberEditRequest {

	private int idx;
	private String uid;
	private String upw;
	private String uname;
	private MultipartFile photo;
	private String oldfile;

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

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	public String getOldfile() {
		return oldfile;
	}

	public void setOldfile(String oldfile) {
		this.oldfile = oldfile;
	}
	
	public Member toMember() {
		return new Member(idx, uid, upw, uname, oldfile.length()>0?oldfile:null, null);
	}

	
	
	@Override
	public String toString() {
		return "MemberEditRequest [idx=" + idx + ", uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", photo="
				+ photo.getOriginalFilename() + ", oldfile=" + oldfile + "]";
	}
	
	
	

}
