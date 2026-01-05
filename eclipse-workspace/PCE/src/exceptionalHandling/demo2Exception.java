package exceptionalHandling;

import java.util.Scanner;

public class demo2Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b = sc.nextInt();
		
		try {
			int c = a/b;
			System.out.println(c);
			System.out.println("Enter size of array: ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("enter index number ");
			int n = sc.nextInt();
			arr[n] = 999;
			  
		}catch(ArithmeticException e) {
			System.out.println("some arithmetic error occur ");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("define index number within range ");
		}catch(NegativeArraySizeException e) {
			System.out.println("enter positive number ");
		}catch(Exception e) {
			System.out.println("divide by 0 is not allowed ");
		}
		System.out.println("Try completed");
	}

}
