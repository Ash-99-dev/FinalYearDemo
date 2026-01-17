package exceptionalHandling;

import java.util.Scanner;

public class bankException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 b = new Bank1();
		b.banking();
	}

}

class Bank1{
	void banking () {
		System.out.println("Banking connection established");
		ATM1 card= new ATM1(); 
		try {
		card.transaction1();
		}catch(Exception e) {
			System.out.println("info received by bank amount will be refunded");
		}
		System.out.println("Banking connection terminated");
	}
}
class ATM1 {
	void transaction1() {
		System.out.println("ATM connection established");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("Exception occured");
			throw e;     // an object is returned 
		}finally {
		System.out.println("ATM connection terminated");
		}
	}
}
