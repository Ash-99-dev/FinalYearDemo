package polymorphism;

class trainer{
	void teach() {
		System.out.println("Teaches");
	}
}
class javaTrainer extends trainer{
	void teach() {
		System.out.println("Teaches  java");
	}
}
class aptiTrainer extends trainer{
	void teach() {
		System.out.println("Teaches aptitude");
	}
}
class testingTrainer extends trainer{
	void teach() {
		System.out.println("Teaches testing");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		trainer t;
		t = new javaTrainer();
		t.teach();
		t = new aptiTrainer();
		t.teach();
		t = new testingTrainer();
		t.teach();
	}

}
