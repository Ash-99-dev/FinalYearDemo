package CollectionFramework;

class student1{
	String name;
	int age;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return name+","+age+","+id;
	}
}
public class toStringMethod {

	public static void main(String[] args) {
		student1 s = new student1();
		s.name = "Ashmit";
		s.age = 21;
		s.id = 1;
		System.out.println(s);
		System.out.println(s.toString());
	}

}
