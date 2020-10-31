package com.tdd.coding.orderingapp.Orderingapp;

import org.junit.jupiter.api.Test;

public class AppTest 	
{
    @Test
    public void checkPhysicalProductShipping()
    {
    	Payment payment = new Payment("physical");
    	assertEquals(true,packslip.isSlipGenerated);
    }
}
