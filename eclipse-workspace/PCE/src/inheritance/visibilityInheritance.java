package inheritance;


class ParentAa{
	void disp() {
		System.out.println("This is a parent class");
	}
}
class ChildAa extends ParentAa{
	protected void disp() {
		System.out.println("This is a child class");
	}
}
public class visibilityInheritance {

	public static void main(String[] args) {
		ChildAa c1 = new ChildAa();
		c1.disp();
	}

}
