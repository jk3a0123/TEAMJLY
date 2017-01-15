package org.teamjly.domain;

public class MosaicVO {

	private Integer ino;
	private Integer bno;
	private String mosaicimage;

	public Integer getIno() {
		return ino;
	}

	public void setIno(Integer ino) {
		this.ino = ino;
	}

	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getMosaicimage() {
		return mosaicimage;
	}

	public void setMosaicimage(String mosaicimage) {
		this.mosaicimage = mosaicimage;
	}

	@Override
	public String toString() {
		return "MosaicVO [ino=" + ino + ", bno=" + bno + ", mosaicimage=" + mosaicimage + "]";
	}

}
