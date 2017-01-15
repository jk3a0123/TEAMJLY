package org.teamjly.domain;

public class MemberVO {
	
	private Integer mno;
	private String id;
	private String password;
	private String nickname;
	private String profile_image;
	
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
	public String getProfile_image() {
		return profile_image;
	}
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	
	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", id=" + id + ", password=" + password + ", nickname=" + nickname
				+ ", profile_image=" + profile_image + "]";
	}
	
	
}
