package stackOverflowHandling;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp();
	}
	static void disp() {
		System.out.println("Hello from disp");
		try {
			disp();
		}catch(Error e) {
			System.out.println("Stack overflow error handled");
		}
	}

}
