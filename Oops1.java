class Student{
    String name;
    int age;
    String course;
    int id;
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(course);
        System.out.println(id);
    }
}
public class Oops1 {
    public static void main(String[] args) {
        
    
    Student s1 = new Student();
    s1.name ="rupesh";
    s1.age =20;
    s1.course="btech";
    s1.id=2023;
    s1.printInfo();
    }
    
}
