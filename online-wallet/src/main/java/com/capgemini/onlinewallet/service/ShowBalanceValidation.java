package com.capgemini.onlinewallet.service;

import com.capgemini.onlinewallet.dao.Connection;

public class ShowBalanceValidation {

		public Double showBalance(Integer userId)
	{
		return new Connection().showBalance(userId);
	}

}
