package polymorphism;
class securityForce{
	void job() {
		System.out.println("\nJob is to protect - ");
	}
	void protect() {
		System.out.println("India through");
	}
}
class Army extends securityForce{
	void protect() {
		System.out.println("Land.");
	}
}
class Navy extends securityForce{
	void protect() {
		System.out.println("Sea ways.");
	}
}
class airForce extends securityForce{
	void protect() {
		System.out.println("Air ways.");
	}
}
public class NationSecurityPolymorphism {

	public static void main(String[] args) {
		work(new Army());
		work(new Navy());
		work(new airForce());
	}
	public static void work(securityForce s) {
		s.job();
		s.protect();
	}

}
