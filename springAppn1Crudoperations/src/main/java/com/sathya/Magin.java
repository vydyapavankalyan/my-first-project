package com.sathya;

public class Magin {
	private int mrgId;
	private String mrgCode;
	public int getMrgId() {
		return mrgId;
	}
	public void setMrgId(int mrgId) {
		this.mrgId = mrgId;
	}
	public String getMrgCode() {
		return mrgCode;
	}
	public void setMrgCode(String mrgCode) {
		this.mrgCode = mrgCode;
	}
	@Override
	public String toString() {
		return "Magin [mrgId=" + mrgId + ", mrgCode=" + mrgCode + "]";
	}
	

}
