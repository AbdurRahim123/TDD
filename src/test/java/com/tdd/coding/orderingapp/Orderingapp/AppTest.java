package com.tdd.coding.orderingapp.Orderingapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.add.coding.orderingapp.interfaces.Packslip;

public class AppTest 	
{
    @Test
    public void checkPhysicalProductShipping()
    {
    	Payment payment = new Payment("physical");
    	Packslip packslip = (Packslip) payment.takeAction();
    	assertEquals(true,packslip.isSlipGenerated());
    }
    @Test
    public void checkbookProductShipping()
    {
    	Payment payment = new Payment("book");
    	Packslip packslip = (Packslip) payment.takeAction();
    	assertEquals(true,packslip.isSlipGenerated());
    }
    @Test
    public void checkbookProductRoyality()
    {
    	Payment payment = new Payment("book");
    	Packslip packslip = (Packslip) payment.takeAction();
    	assertEquals(true,packslip.isSlipGenerated());
    }
    @Test
    public void checkMemberShipactivated()
    {
    	Payment payment = new Payment("mebership");
    	Membership membership = (Membership) payment.takeAction();
    	assertEquals(true,membership.isActivated());
    }

}
