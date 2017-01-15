package org.teamjly.domain;

public class MemberVO {
	
	private Integer mno;
	private String id;
	private String password;
	private String nickname;
	private String profileimage;
	
	
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getProfileimage() {
		return profileimage;
	}
	public void setProfileimage(String profileimage) {
		this.profileimage = profileimage;
	}
	
	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", id=" + id + ", password=" + password + ", nickname=" + nickname
				+ ", profileimage=" + profileimage + "]";
	}
	
	
	
	
}
