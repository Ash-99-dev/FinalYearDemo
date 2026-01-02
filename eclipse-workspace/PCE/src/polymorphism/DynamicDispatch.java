package polymorphism;

class Tendulkar{
	void job() {
		System.out.println("play cricket");
	}
	void profession() {
		System.out.println("He is batsman");
	}
}
class arjunTendulkar extends Tendulkar{
	void smoke() {
		System.out.println("He smoke");
	}
	void profession() {
		System.out.println("Bowler");
	}
}
public class DynamicDispatch {

	public static void main(String[] args) {
		Tendulkar t = new arjunTendulkar();
		t.job();
		t.profession();
		// limitation of parent type reference
		//t.smoke();    //not allowed, only method to which reference is created
		//((arjunTendulkar)t).smoke(); // allowed but tight coupling
	}

}
