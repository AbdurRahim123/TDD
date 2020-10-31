package com.tdd.coding.orderingapp.Orderingapp;

import com.add.coding.orderingapp.interfaces.Packslip;

public class PackSlipRoyalty implements Packslip{
	 private boolean isSlipGenerated;
	 private String slipNo;
	 PackSlipRoyalty(String slipNo)
	 {
	 this.slipNo=slipNo;
	 }
	 PackSlipRoyalty()
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
