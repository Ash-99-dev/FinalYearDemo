package accessmodifier2;
import com.accessmodifier1.DemoApp1;


public class DemoApp2 {
	public static void main(String[] args) {
		disp3();
		Demo4 d4 = new Demo4();
		d4.disp4();
	}
	static void disp3() {
				DemoApp1 d1 = new DemoApp1();
				System.out.println(d1.a);
				//System.out.println(d1.b);
				//System.out.println(d1.c);
				//System.out.println(d1.d);
	}

}
class Demo4 extends DemoApp1{
	void disp4() {
		System.out.println(a);   // public 
		System.out.println(b);   // protected
		//System.out.println(c);   // default
		//System.out.println(d);   // private
	}
}
