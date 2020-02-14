package com.capgemini.onlinewallet.util;

import java.util.HashMap;

import com.capgemini.onlinewallet.dto.WalletAccount;

public class WalletAccountRepository {
    static HashMap<Integer,WalletAccount> walletAccountTable=new HashMap<Integer,WalletAccount>();
	public static HashMap<Integer, WalletAccount> getWalletAccountTable() {
		return walletAccountTable;
	}
	public static void setWalletAccountTable(HashMap<Integer, WalletAccount> walletAccountTable) {
		WalletAccountRepository.walletAccountTable = walletAccountTable;
	}
	public WalletAccountRepository() {
		// TODO Auto-generated constructor stub
	}
    public void putData(WalletAccount wa)
    {
    	walletAccountTable.put(wa.getAccountID(), wa);
    }
}
