package com.objectcreation;

class Student {
    public Student() {}
}

public class usingReflection {

	public static void main(String[] args) {
		try {
            //Class<?> c = Class.forName("com.objectcreation.Student");  // this is object creation by reflection which require full path of class student
            Class<Student> c= Student.class;
            Student s = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
