package com.Encapsulation;

class e2Employee {
    int empId;

    public e2Employee() {
        this(101, "ash", 21);
        System.out.println("0 constructor");
    }

    public e2Employee(int empId) {
        System.out.println("1 constructor");
    }

    public e2Employee(int empId, String name) {
        this(101);
        System.out.println("2 constructor");
    }

    public e2Employee(int empId, String name, int salary) {
        this(101, "ash");
        System.out.println("3 constructor");
    }
}

class localConstructor {
    public static void main(String[] args) {
        e2Employee e = new e2Employee();
    }
}
