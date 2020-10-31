package com.tdd.coding.orderingapp.Orderingapp;

import com.add.coding.orderingapp.interfaces.Action;

public class Membership implements Action {
public boolean isActivated;

public boolean isActivated() {
	return isActivated;
}

public void setActivated(boolean isActivated) {
	this.isActivated = isActivated;
}

}
