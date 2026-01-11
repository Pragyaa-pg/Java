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
    Student(String name,int age,int id,String course){
        System.out.println("constructor called");
        this.name =name;
        this.age =age;
        this.course =course;
        this.id =id;
    }
}
public class Oops1 {
    public static void main(String[] args) {
    Student s1 = new Student("pragya",20,2023,"btech");
    // s1.name ="rupesh";
    // s1.age =20;
    // s1.course="btech";
    // s1.id=2023;
    s1.printInfo();
    }
    
}
