package interface19day;

import java.util.Scanner;

public class newCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int b = sc.nextInt();
		
		System.out.println("Enter operator(+,-,*,/): ");
		String op = sc.next();
		sc.nextLine();
		sc.close();
		char operator = op.charAt(0);
		
		switch(operator) {
		case '+':
			new ashGrow(a,b).add();
			break;
		case '-':
			new ashGrow(a,b).sub();
			break;
		case '*':
			new ashGrow(a,b).mul();
			break;
		case '/':
			new ashGrow(a,b).div();
			break;
		default:
			System.out.println("Enter valid operator");
		}
	}
	

}
