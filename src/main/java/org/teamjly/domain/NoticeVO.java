package org.teamjly.domain;

import java.util.Date;

public class NoticeVO {
	
	private Integer nno;
	private String title;
	private String content;
	private String writer;
	private Integer views;
	private Date regdate;
	private Date updatedate;
	public Integer getNno() {
		return nno;
	}
	public void setNno(Integer nno) {
		this.nno = nno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "NoticeVO [nno=" + nno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", views="
				+ views + ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
}
