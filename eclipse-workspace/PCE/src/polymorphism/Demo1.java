package polymorphism;

class trainer1{
	void teach() {
		System.out.println("Teaches");
	}
}
class javaTrainer1 extends trainer1{
	void teach() {
		System.out.println("Teaches  java");
	}
}
class aptiTrainer1 extends trainer1{
	void teach() {
		System.out.println("Teaches aptitude");
	}
}
class testingTrainer1 extends trainer1{
	void teach() {
		System.out.println("Teaches testing");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		trainer1 t;
		t = new javaTrainer1();    // Loose coupling or polymorphism
		t.teach();
		t = new aptiTrainer1();
		t.teach();
		t = new testingTrainer1();
		t.teach();
	}

}
