package exceptionalHandling;

import java.util.Scanner;

public class demo3Exception {

	public static void main(String[] args) {
		System.out.println("Connection main established ");
		new Test1().alpha();
		System.out.println("Connection main terminared ");
	}

}
class Test1{
	void alpha() {
		System.out.println("Connection 1 established ");
		new Test2().beta();
		System.out.println("Connection 1 terminated ");
	}
}
class Test2{
	void beta() {
		System.out.println("Connection 2 established ");
		try {
			new Test3().gamma();
		}catch(ArithmeticException e) {
			System.out.println("Exception handled at beta");
		}
		System.out.println("Connection 2 terminated ");
	}
}
class Test3{
	void gamma() throws  ArithmeticException{
		System.out.println("Connection 3 established ");
		int a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a: ");
		a = sc.nextInt();
		System.out.println("ENter b: ");
		b = sc.nextInt();
		sc.close();
		int c = a/b;
		
		System.out.println("Connection 3 terminated ");
	}
	void newGamma() {
		int a = 10;
	}
}