package staticBlock;

class staticDemo{
	static int a;
	static int b;
	static {
		a = 100;
		b = 200;
		
	}
	static void disp() {
		System.out.println(a);
		System.out.println(b);
	}
	int x;
	int y;
	{
		a = 300;
		b = 400;
		x = 500;
		y = 600;
	}
	void disp2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class staticBlockCode1 {

	public static void main(String[] args) {
		staticDemo.disp();
		staticDemo sd = new staticDemo();
		sd.disp2();

	}

}
