
abstract class Person {
    Person() {
        System.out.println("Person constructor called");
    }
}

class Student extends Person {
    Student() {
        System.out.println("Student constructor called");
    }
}

public class abstract_constructor {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

