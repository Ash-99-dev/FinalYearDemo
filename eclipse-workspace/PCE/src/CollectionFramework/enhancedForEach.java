package CollectionFramework;

class Student{
	private String name;
	private int age;
	private String gender;
	Student(String name, int age, String gender){
		this.name = name;	
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+
				",Age: "+age+",Gender: "+gender;
	}
}
public class enhancedForEach {

	public static void main(String[] args) {
		Student s1 = new Student("Ashmit", 20, "Male");
		Student s2 = new Student("Shubham", 20, "Male");
		Student s3 = new Student("Akash", 20, "Male");
		Student[] arr = {s1, s2, s3};
		for(Student stu : arr) {
			System.out.println(stu.toString());
			System.out.println();
		}
	}

}