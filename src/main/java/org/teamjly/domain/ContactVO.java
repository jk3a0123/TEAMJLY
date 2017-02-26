package org.teamjly.domain;

public class ContactVO {
	
	private Integer cno;
	private Integer mno;
	private Integer cto;
	private String subject;
	private String content;
	private String file;
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "ContactVO [cno=" + cno + ", mno=" + mno + ", subject=" + subject + ", content=" + content + ", file="
				+ file + "]";
	}
	
	
}
