package exceptionalHandling;

import java.util.Scanner;

public class demo1Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b = sc.nextInt();
		int c = 0;
		try {
			c = a/b;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Division : "+c);
		}
	}

}
