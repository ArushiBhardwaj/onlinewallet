package com.capgemini.onlinewallet.ui;

import com.capgemini.onlinewallet.service.*;
import com.capgemini.onlinewallet.service.Transaction;

public class Menu {
    Integer userId;
    java.util.Scanner sc=new java.util.Scanner(System.in);
	public Menu(Integer uid) {
    	userId=uid;
    	askInput();
    	
    	
	}
        void askInput()
        {   while(true) 
           {
        	System.out.println("Which tasks you want to perform? Enter respective number");
        	System.out.println("1:  Show Current Balance");
        	System.out.println("2:  Add Money to Account");
        	System.out.println("3:  Transfer Money to another Account");
        	int input=sc.nextInt();
        	switch(input)
        	{
        	case 1: System.out.println(new ShowBalanceValidation().showBalance(userId));
        		    break;
        	case 2: askAmountDetails();
        		    break;
        	case 3: askTransactionDetails();
        	        break;
        	default:System.out.println("wrong choice");
        	        return;
        	}
           }
        }
        void askAmountDetails()
        {
        	System.out.println("Enter amount to add in your account");
        	Double amount=sc.nextDouble();
        	new AddAmountValidation().addAmount(userId, amount);
        	
        }
        void askTransactionDetails()
        {
        	System.out.println("Enter Amount");
        	Double amount=sc.nextDouble();
        	System.out.println("Enter the accountid of benefeciary");
        	Integer tid=sc.nextInt();
        	new Transaction().transactMoney(userId, amount, tid);
        }

}
