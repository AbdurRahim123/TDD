package com.tdd.coding.orderingapp.Orderingapp;

import com.add.coding.orderingapp.interfaces.Action;

public class UpgradeMember implements Action {

public boolean isActivated;
int membershipId;
public boolean isActivated() {
	return isActivated;
}
UpgradeMember(int membershipId)
{
	this.membershipId = membershipId;
}

public void setActivated(boolean isActivated) {
	this.isActivated = isActivated;
}

}
