package org.teamjly.domain;

public class ReplyVO {

	private Integer rno;
	private Integer mno;
	private Integer bno;
	private String content;
	private String regdate;
	
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", mno=" + mno + ", bno=" + bno + ", content=" + content + ", regdate=" + regdate
				+ "]";
	}


}
