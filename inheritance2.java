
class Employee {
    int salary = 30000;
}

class Developer extends Employee {
    int bonus = 10000;
}

public class inheritance2 {
    public static void main(String[] args) {
        Developer d = new Developer();
        System.out.println(d.salary); // from Employee
        System.out.println(d.bonus);  // from Developer
    }
}
