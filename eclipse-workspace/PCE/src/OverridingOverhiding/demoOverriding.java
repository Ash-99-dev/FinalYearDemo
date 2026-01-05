package OverridingOverhiding;


class parent1{
	void disp() {
		System.out.println("Parent Method");
	}
}
class child1 extends parent1{
	void disp() {
		System.out.println("Child Method");
	}
}
public class demoOverriding {

	public static void main(String[] args) {
		parent1 p = new parent1();
		p.disp();
		child1 c = new child1();
		c.disp();
		parent1 p1 = new child1();
		p1.disp();
	}

}
