package com.tdd.coding.orderingapp.Orderingapp;

import com.add.coding.orderingapp.interfaces.Action;

public class Payment 
{
	private String paymentType;
	Action action;

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
	public Action takeAction() {
		if (paymentType.equalsIgnoreCase("physical"))
		{
			 action = new PackSlipShipping();
		}
		return action; 
	}
	
}
