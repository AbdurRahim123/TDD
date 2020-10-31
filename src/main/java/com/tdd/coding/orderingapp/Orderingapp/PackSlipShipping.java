package com.tdd.coding.orderingapp.Orderingapp;

import com.add.coding.orderingapp.interfaces.Packslip;

public class PackSlipShipping implements Packslip {
 private boolean isSlipGenerated;
 
	public void setSlipGenerated(boolean isSlipGenerated) {
	this.isSlipGenerated = isSlipGenerated;
}
@Override
	public boolean isSlipGenerated() {
		return isSlipGenerated;
	}

}
