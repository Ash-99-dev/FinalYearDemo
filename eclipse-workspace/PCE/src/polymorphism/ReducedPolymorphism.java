package polymorphism;

class trainer12{
	void teach() {
		System.out.println("Teaches");
	}
}
class javaTrainer extends trainer12{
	void teach() {
		System.out.println("Teaches  java");
	}
}
class aptiTrainer extends trainer12{
	void teach() {
		System.out.println("Teaches aptitude");
	}
}
class testingTrainer extends trainer12{
	void teach() {
		System.out.println("Teaches testing");
	}
}
public class ReducedPolymorphism {

	public static void main(String[] args) {
		// true Polymorphism
		duty(new javaTrainer());    // Loose coupling or polymorphism
		
		duty(new aptiTrainer());    //DI : this object is injected in this dependency
		
		duty(new testingTrainer());
		
	}
	public static void duty(trainer12 t) {
		t.teach();
	}

}