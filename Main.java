class Student {
    private String name;

    // Setter
    public void setName(String n) {
        name = n;
    }

    // Getter
    public String getName() {
        return name;
    }
}

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Pragya");
        System.out.println(s1.getName());
    }
}

