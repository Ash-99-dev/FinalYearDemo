package com.SmartBank.Repository;

import java.util.HashMap;
import java.util.Map;

import com.SmartBank.Model.*;

public class AppRepo1 {

	public static void main(String[] args) {
		// Database storage
		Map<Integer, UserAccount> accounts = new HashMap<>(); 
		System.out.println(accounts);
	}

}
