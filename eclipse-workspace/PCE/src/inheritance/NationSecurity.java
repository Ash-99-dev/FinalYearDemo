package inheritance;

class securityForce{
	void job() {
		System.out.println("Job is to protect - ");
	}
	void protect() {
		//System.out.println("India through");
	}
}
class Army extends securityForce{
	void protect() {
		System.out.print("Land using - ");
	}
	void usetank() {
		System.out.println("Tank");
	}
}
class Navy extends securityForce{
	void protect() {
		System.out.print("Sea ways using - ");
	}
	void useship() {
		System.out.println(" Distroyer ship");
	}
}
class airForce extends securityForce{
	void protect() {
		System.out.print("Air ways using - ");
	}
	void usejets() {
		System.out.println("Fighter jets.");
	}
}
public class NationSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army army = new Army();
		army.job();        // inherited
		army.protect();   // overwritten/ modified method
		army.usetank();   // spetialised
		System.out.println("\n");
		Navy navy = new Navy();
		navy.job();
		navy.protect();
		navy.useship();
		System.out.println("\n");
		airForce a = new airForce();
		a.job();
		a.protect();
		a.usejets();
	}

}
