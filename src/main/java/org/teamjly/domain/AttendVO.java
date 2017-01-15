package org.teamjly.domain;

public class AttendVO {

	private Integer ano;
	private Integer bno;
	private Integer mno;
	
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	
	@Override
	public String toString() {
		return "AttendVO [ano=" + ano + ", bno=" + bno + ", mno=" + mno + "]";
	}
	
	
}
