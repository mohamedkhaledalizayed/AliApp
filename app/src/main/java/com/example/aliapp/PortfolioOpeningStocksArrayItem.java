package com.example.aliapp;

import com.google.gson.annotations.SerializedName;

public class PortfolioOpeningStocksArrayItem{

	@SerializedName("PortfolioNameEN")
	private String portfolioNameEN;

	@SerializedName("PartnerNameEN")
	private String partnerNameEN;

	@SerializedName("OpeningStocksCount")
	private int openingStocksCount;

	@SerializedName("PortfolioNameAR")
	private String portfolioNameAR;

	@SerializedName("PortfolioID")
	private int portfolioID;

	@SerializedName("PartnerID")
	private int partnerID;

	@SerializedName("PortOPenStockID")
	private int portOPenStockID;

	@SerializedName("OpeningStockValue")
	private int openingStockValue;

	@SerializedName("PortfolioCode")
	private String portfolioCode;

	@SerializedName("PartnerNameAR")
	private String partnerNameAR;

	@SerializedName("PartnerCode")
	private String partnerCode;

	public void setPortfolioNameEN(String portfolioNameEN){
		this.portfolioNameEN = portfolioNameEN;
	}

	public String getPortfolioNameEN(){
		return portfolioNameEN;
	}

	public void setPartnerNameEN(String partnerNameEN){
		this.partnerNameEN = partnerNameEN;
	}

	public String getPartnerNameEN(){
		return partnerNameEN;
	}

	public void setOpeningStocksCount(int openingStocksCount){
		this.openingStocksCount = openingStocksCount;
	}

	public int getOpeningStocksCount(){
		return openingStocksCount;
	}

	public void setPortfolioNameAR(String portfolioNameAR){
		this.portfolioNameAR = portfolioNameAR;
	}

	public String getPortfolioNameAR(){
		return portfolioNameAR;
	}

	public void setPortfolioID(int portfolioID){
		this.portfolioID = portfolioID;
	}

	public int getPortfolioID(){
		return portfolioID;
	}

	public void setPartnerID(int partnerID){
		this.partnerID = partnerID;
	}

	public int getPartnerID(){
		return partnerID;
	}

	public void setPortOPenStockID(int portOPenStockID){
		this.portOPenStockID = portOPenStockID;
	}

	public int getPortOPenStockID(){
		return portOPenStockID;
	}

	public void setOpeningStockValue(int openingStockValue){
		this.openingStockValue = openingStockValue;
	}

	public int getOpeningStockValue(){
		return openingStockValue;
	}

	public void setPortfolioCode(String portfolioCode){
		this.portfolioCode = portfolioCode;
	}

	public String getPortfolioCode(){
		return portfolioCode;
	}

	public void setPartnerNameAR(String partnerNameAR){
		this.partnerNameAR = partnerNameAR;
	}

	public String getPartnerNameAR(){
		return partnerNameAR;
	}

	public void setPartnerCode(String partnerCode){
		this.partnerCode = partnerCode;
	}

	public String getPartnerCode(){
		return partnerCode;
	}

	@Override
 	public String toString(){
		return 
			"PortfolioOpeningStocksArrayItem{" + 
			"portfolioNameEN = '" + portfolioNameEN + '\'' + 
			",partnerNameEN = '" + partnerNameEN + '\'' + 
			",openingStocksCount = '" + openingStocksCount + '\'' + 
			",portfolioNameAR = '" + portfolioNameAR + '\'' + 
			",portfolioID = '" + portfolioID + '\'' + 
			",partnerID = '" + partnerID + '\'' + 
			",portOPenStockID = '" + portOPenStockID + '\'' + 
			",openingStockValue = '" + openingStockValue + '\'' + 
			",portfolioCode = '" + portfolioCode + '\'' + 
			",partnerNameAR = '" + partnerNameAR + '\'' + 
			",partnerCode = '" + partnerCode + '\'' + 
			"}";
		}
}