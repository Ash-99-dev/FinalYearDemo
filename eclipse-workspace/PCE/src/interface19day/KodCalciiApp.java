package interface19day;

import java.util.Scanner;

public class KodCalciiApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter value of a: ");
		a = sc.nextInt();
		System.out.println("Enter value of b: ");
		b = sc.nextInt();
		
		System.out.println("<<<<<<<<<<Printing by user input>>>>>>>>>>\n");
		duty(new ashGrow(a,b));
		//ashOther ao = new ashOther();
		System.out.println("<<<<<<<<<<Printing by given value>>>>>>>>>>\n");
		duty(new ashOther());
		/*ao.add();
		ao.sub();
		ao.mul();
		ao.div();*/
		
	}
	static void duty(KodCalci ag) {
		ag.add();
		ag.sub();
		ag.mul();
		ag.div();
		//((ashGrow)(ag)).mod();  // child type achieved by [DownCasting].
	}

}
class ashGrow implements KodCalci{
	int a , b;
	ashGrow(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public void add() {
		System.out.println("Addition: "+ (a+b));
	}

	@Override
	public void sub() {
		System.out.println("Substraction: "+ (a-b));
	}

	@Override
	public void mul() {
		System.out.println("Multiplication: "+(a*b));
	}

	@Override
	public void div() {
		System.out.println("Division: "+(a/b));
	}
	public void mod() {
		System.out.println("Modulus: "+(a%b));
	}
	
}

class ashOther implements KodCalci{
	final static int a = 50;
	final static int b = 5;

	@Override
	public void add() {
		System.out.println("Addition: "+ (a+b));
	}

	@Override
	public void sub() {
		System.out.println("Substraction: "+ (a-b));
	}

	@Override
	public void mul() {
		System.out.println("Multiplication: "+(a*b));
	}

	@Override
	public void div() {
		System.out.println("Division: "+(a/b));
	}
	
}