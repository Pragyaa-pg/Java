
class Bank {
    int getInterest() {
        return 5;
    }
}

class SBI extends Bank {
    int getInterest() {
        return 7;
    }
}

public class inheritance_polymorphisim {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println(b.getInterest());
    }
}
