package org.teamjly.domain;

import java.util.Date;

public class NoticeVO {
	
	private Integer nno;
	private String title;
	private String content;
	private Integer mno;
	private String id;
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
		return "NoticeVO [nno=" + nno + ", title=" + title + ", content=" + content + ", mno=" + mno + ", id=" + id
				+ ", views=" + views + ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
	
}
