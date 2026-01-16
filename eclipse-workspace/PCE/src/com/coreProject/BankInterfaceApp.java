package com.coreProject;

import java.util.Scanner;

interface CreateAccount{
	UserAccount createAcc(Scanner sc);
}
interface DepositSection{
	void deposit(UserAccount useracc, Scanner sc);
}
interface TransferSection{
	void transfer(UserAccount accS, UserAccount accR, Scanner sc);
}
interface CheckBalance{
	double balance(UserAccount useracc);
}