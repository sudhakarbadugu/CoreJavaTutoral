// package com.sudhasoft.model;
public class StockAlertModel{
    private int id;
    private String stockName;
    private String strategyAction;
    private String strategyName;
    private Double stopLoss;
    private Double target1;
    private Double target2;
    private Double target3;
    private Double target4;
    private Double currentPrice;
    private Double openPrice;
    private Double profitOrLoss;
    private String result1;

	public int getId(){
		return id;
	}
	public void setId(int id ){
		this.id=id;
	}
	public String getstockName(){
		return stockName;
	}
	public void setstockName(String stockName){
		this.stockName=stockName;
	}
	public String getstrategyAction(){
		return strategyAction;
	}
	public void setstrategyAction(String strategyAction){
		this.strategyAction=strategyAction;
	}
	public String getstrategyName(){
		return strategyName;
	}
	public void setstrategyName(String strategyName){
		this.strategyName=strategyName;
	}
	public Double getstopLoss(){
		return stopLoss;
	}
	public void setstopLoss(double stopLoss){
		this.stopLoss=stopLoss;
	}
	public Double gettarget1(){
		return target1;
	}
	public void settarget1(double target1){
		this.target1=target1;
	}
	public Double gettarget2(){
		return target2;
	}
	public void settarget2(double target2){
		this.target2=target2;
	}
	public Double gettarget3(){
		return target3;
	}
	public void settarget3(double target3){
		this.target3=target3;
	}
	public Double gettarget4(){
		return target4;
	}
	public void settarget4(double target4){
		this.target4=target4;
	}
	public Double getcurrentPrice(){
		return currentPrice;
	}
	public void setcurrentPrice(double currentPrice){
		this.currentPrice=currentPrice;
	}
	public Double getopenPrice(){
		return openPrice;
	}
	public void setopenPrice(double openPrice){
		this.openPrice=openPrice;
	}
	public Double getprofitOrLoss(){
		return profitOrLoss;
	}
	public void setprofitOrLoss(double profitOrLoss){
		this.profitOrLoss=profitOrLoss;
	}
	 public String getresult1(){
		return result1;
	 }
	 public void setresult1(String result1){
		 this.result1=result1;
	  }
}
	
		
	
