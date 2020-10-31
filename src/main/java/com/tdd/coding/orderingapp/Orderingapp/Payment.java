package com.tdd.coding.orderingapp.Orderingapp;

public class Payment 
{
	private String paymentType;

	Payment(String paymentType)
	{
		this.paymentType = paymentType;	
	}
	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
}
