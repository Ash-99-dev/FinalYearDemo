package com.SmartBank.Service;

import com.SmartBank.Model.*;

public class BalanceService {

	public double balance(UserAccount useracc) {
		return useracc.balance;
	}
}