package OverridingOverhiding;

class parent2{
	static void disp() {
		System.out.println("Parent Method");
	}
}
class child2 extends parent2{
	static void disp() {
		System.out.println("Child Method");
	}
}
public class demoOverhiding {

	public static void main(String[] args) {
		parent2 p = new parent2();
		p.disp();
		child2 c = new child2();
		c.disp();
		parent2 p1 = new child2();
		p1.disp();
	}

}
