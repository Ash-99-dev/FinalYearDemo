package interface19day;

interface KodCalcii1{
	void add();
	void sub();
}
interface KodCalcii2{
	void mul();
	void div();
	void mod();
}
class ashApp implements KodCalcii1, KodCalcii2{

	public void mul() {
		System.out.println("Multiplication method");
	}
	public void div() {
		System.out.println("Division method");
	}

	public void mod() {
		System.out.println("Modulous method");
	}

	public void add() {
		System.out.println("Addition method");
	}

	public void sub() {
		System.out.println("Substraction method");
	}
	
}
public class KodCalsiApp1 {

	public static void main(String[] args) {
		ashApp as = new ashApp();
		as.add();
		as.sub();
		as.mul();
		as.div();
		as.mod();
	}

}
