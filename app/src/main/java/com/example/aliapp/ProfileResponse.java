package com.example.aliapp;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ProfileResponse{

	@SerializedName("Description")
	private String description;

	@SerializedName("AccountID")
	private int accountID;

	@SerializedName("portfolioOpeningStocksArray")
	private List<PortfolioOpeningStocksArrayItem> portfolioOpeningStocksArray;

	@SerializedName("PortfolioAccountDebit")
	private Object portfolioAccountDebit;

	@SerializedName("Count")
	private int count;

	@SerializedName("portfolioTransactionModels")
	private Object portfolioTransactionModels;

	@SerializedName("Code")
	private String code;

	@SerializedName("EstablishDate")
	private String establishDate;

	@SerializedName("TotalStocksCount")
	private int totalStocksCount;

	@SerializedName("EstablishDateHijri")
	private String establishDateHijri;

	@SerializedName("RSBalance")
	private int rSBalance;

	@SerializedName("LastCode")
	private Object lastCode;

	@SerializedName("AccountNameAR")
	private String accountNameAR;

	@SerializedName("NameEN")
	private String nameEN;

	@SerializedName("AccountCode")
	private String accountCode;

	@SerializedName("PortfolioID")
	private int portfolioID;

	@SerializedName("AccountNameEN")
	private String accountNameEN;

	@SerializedName("NameAR")
	private String nameAR;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setAccountID(int accountID){
		this.accountID = accountID;
	}

	public int getAccountID(){
		return accountID;
	}

	public void setPortfolioOpeningStocksArray(List<PortfolioOpeningStocksArrayItem> portfolioOpeningStocksArray){
		this.portfolioOpeningStocksArray = portfolioOpeningStocksArray;
	}

	public List<PortfolioOpeningStocksArrayItem> getPortfolioOpeningStocksArray(){
		return portfolioOpeningStocksArray;
	}

	public void setPortfolioAccountDebit(Object portfolioAccountDebit){
		this.portfolioAccountDebit = portfolioAccountDebit;
	}

	public Object getPortfolioAccountDebit(){
		return portfolioAccountDebit;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setPortfolioTransactionModels(Object portfolioTransactionModels){
		this.portfolioTransactionModels = portfolioTransactionModels;
	}

	public Object getPortfolioTransactionModels(){
		return portfolioTransactionModels;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setEstablishDate(String establishDate){
		this.establishDate = establishDate;
	}

	public String getEstablishDate(){
		return establishDate;
	}

	public void setTotalStocksCount(int totalStocksCount){
		this.totalStocksCount = totalStocksCount;
	}

	public int getTotalStocksCount(){
		return totalStocksCount;
	}

	public void setEstablishDateHijri(String establishDateHijri){
		this.establishDateHijri = establishDateHijri;
	}

	public String getEstablishDateHijri(){
		return establishDateHijri;
	}

	public void setRSBalance(int rSBalance){
		this.rSBalance = rSBalance;
	}

	public int getRSBalance(){
		return rSBalance;
	}

	public void setLastCode(Object lastCode){
		this.lastCode = lastCode;
	}

	public Object getLastCode(){
		return lastCode;
	}

	public void setAccountNameAR(String accountNameAR){
		this.accountNameAR = accountNameAR;
	}

	public String getAccountNameAR(){
		return accountNameAR;
	}

	public void setNameEN(String nameEN){
		this.nameEN = nameEN;
	}

	public String getNameEN(){
		return nameEN;
	}

	public void setAccountCode(String accountCode){
		this.accountCode = accountCode;
	}

	public String getAccountCode(){
		return accountCode;
	}

	public void setPortfolioID(int portfolioID){
		this.portfolioID = portfolioID;
	}

	public int getPortfolioID(){
		return portfolioID;
	}

	public void setAccountNameEN(String accountNameEN){
		this.accountNameEN = accountNameEN;
	}

	public String getAccountNameEN(){
		return accountNameEN;
	}

	public void setNameAR(String nameAR){
		this.nameAR = nameAR;
	}

	public String getNameAR(){
		return nameAR;
	}

	@Override
 	public String toString(){
		return 
			"ProfileResponse{" + 
			"description = '" + description + '\'' + 
			",accountID = '" + accountID + '\'' + 
			",portfolioOpeningStocksArray = '" + portfolioOpeningStocksArray + '\'' + 
			",portfolioAccountDebit = '" + portfolioAccountDebit + '\'' + 
			",count = '" + count + '\'' + 
			",portfolioTransactionModels = '" + portfolioTransactionModels + '\'' + 
			",code = '" + code + '\'' + 
			",establishDate = '" + establishDate + '\'' + 
			",totalStocksCount = '" + totalStocksCount + '\'' + 
			",establishDateHijri = '" + establishDateHijri + '\'' + 
			",rSBalance = '" + rSBalance + '\'' + 
			",lastCode = '" + lastCode + '\'' + 
			",accountNameAR = '" + accountNameAR + '\'' + 
			",nameEN = '" + nameEN + '\'' + 
			",accountCode = '" + accountCode + '\'' + 
			",portfolioID = '" + portfolioID + '\'' + 
			",accountNameEN = '" + accountNameEN + '\'' + 
			",nameAR = '" + nameAR + '\'' + 
			"}";
		}
}