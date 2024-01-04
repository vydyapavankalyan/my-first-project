package com.sathya;

public class Product {
	private int proId;
	private String proName;
	private Model mob;
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Model getMob() {
		return mob;
	}
	public void setMob(Model mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", mob=" + mob + "]";
	}
	public void printProduct() {
		System.out.println(proId+"\t"+proName);
		System.out.println(mob);
		
	}
	
	

}
