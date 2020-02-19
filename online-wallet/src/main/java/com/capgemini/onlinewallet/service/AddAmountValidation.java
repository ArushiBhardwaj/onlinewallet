package com.capgemini.onlinewallet.service;

import com.capgemini.onlinewallet.dao.Connection;
import com.capgemini.onlinewallet.exception.NegativeValueException;

public class AddAmountValidation {

	    public Double addAmount(Integer userId,Double amount)
    {
    	try
    	
    	{
    		if(amount<=0)
    		{throw new NegativeValueException("Please enter Valid amount");}
    	}
    	catch(NegativeValueException e)
    	{
    		System.err.println(e.getMessage());
    	}
    	return new Connection().addAmount(userId, amount);
    }
}
