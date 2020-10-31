package com.tdd.coding.orderingapp.Orderingapp;

import com.add.coding.orderingapp.interfaces.Packslip;

public class PackSlipShipping implements Packslip {
 private boolean isSlipGenerated;
 private String slipNo;
 PackSlipShipping(String slipNo)
 {
 this.slipNo=slipNo;
 }
 PackSlipShipping()
 {
	 
 }
	public String getSlipNo() {
	return slipNo;
}
public void setSlipNo(String slipNo) {
	this.slipNo = slipNo;
}
	public void setSlipGenerated(boolean isSlipGenerated) {
	this.isSlipGenerated = isSlipGenerated;
}

@Override
	public boolean isSlipGenerated() {
		return isSlipGenerated;
	}

}
