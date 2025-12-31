// package Java_practice;

    class BankAccount {
    private int balance = 1000;   // data hidden

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    }

public class encapsulation{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(500);
        System.out.println(b.getBalance());
    }
}


