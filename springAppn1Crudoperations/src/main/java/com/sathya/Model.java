package com.sathya;

public class Model {
  
	private int modelId;
	private String modelCode;
	private double modelCost;
	private Magin mgOn;
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public double getModelCost() {
		return modelCost;
	}
	public void setModelCost(double modelCost) {
		this.modelCost = modelCost;
	}
	public Magin getMgOn() {
		return mgOn;
	}
	public void setMgOn(Magin mgOn) {
		this.mgOn = mgOn;
	}
	@Override
	public String toString() {
		return "Model [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", mgOn=" + mgOn
				+ "]";
	}
	
}
