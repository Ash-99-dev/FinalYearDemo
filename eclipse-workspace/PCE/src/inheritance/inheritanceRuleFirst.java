package inheritance;

public class inheritanceRuleFirst {

	public static void main(String[] args) {
		Child1 c = new Child1();
		//System.out.println(c.a);  // private variable cannot be accessed 
		System.out.println(c.b);
		//c.disp();     // private method cannot be accessed 
	}

}

class Parent1{
	private int a = 10;
	int b = 20;
	private void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}
class Child1 extends Parent1{
	
}
