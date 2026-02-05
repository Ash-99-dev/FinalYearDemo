package MapHierarchy;

import java.util.HashMap;

class Student{
	String name;
	int age;
	String gender;
	String p_number;
	int marks;
	String semester;
	String e_mail;
	String address;
	int height;
	int weight;
	String bloodGroup;
	Student(String name, int age, String gender,String p_number, int marks,String semester,String e_mail,String address,
			int height, int weight, String bloodGroup){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.p_number = p_number;
		this.marks = marks;
		this.semester = semester;
		this.e_mail = e_mail;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.bloodGroup  = bloodGroup;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", p_number=" + p_number + ", marks="
				+ marks + ", semester=" + semester + ", e_mail=" + e_mail + ", address=" + address + ", height="
				+ height + ", weight=" + weight + ", bloodGroup=" + bloodGroup + "]\n";
	}
	
	
}
public class StudentForm {

	public static void main(String[] args) {
		Student s1 = new Student("Ashmit", 20, "Male", "+9175846952", 99, "7thSem", "ashmit@gmail.com", "sanjay nagar", 54, 50, "A+");
		Student s2 = new Student("Ash", 20, "Male", "+91758896952", 89, "7thSem", "ash@gmail.com", "Rajiv nagar", 60, 52, "O+");
		Student s3 = new Student("Akash", 21, "Male", "+9175846222", 91, "6thSem", "akash@gmail.com", "Mahal nagar", 50, 50, "B+");
		HashMap<Integer, Student> hs = new HashMap<Integer, Student>();
		hs.put(101, s1);
		hs.put(102, s2);
		hs.put(103, s3);
		System.out.println(hs);
		hs.clear();
	}

}
