package assessment2;

class Account {
    int balanceAmount;

    // No argument constructor
    Account() {
        this.balanceAmount = 0;
    }

    // Constructor with Argument (initial balance)
    Account(int balance) {
        this.balanceAmount = balance;
    }

    // Deposit method
    void deposit(int amount) {
        balanceAmount += amount;
        System.out.println("Your deposit amount is: " + amount);
    }

    // Withdraw method
    void withdraw(int amount) {
        if (balanceAmount < amount) {
            System.out.println("Insufficient balance");
        } else {
            balanceAmount -= amount;
            System.out.println("Your withdrawal amount is: " + amount);
        }
    }

    // Display balance method
    void balance() {
        System.out.println("Your balance is: " + balanceAmount);
    }
}

public class questiom3 {
    public static void main(String[] args) {
        // First account using no arg constructor
        Account obj1 = new Account();
        obj1.deposit(10000);
        obj1.withdraw(5000);
        obj1.balance();

        System.out.println(); // Space

        // Second account using parameterized constructor
        Account obj2 = new Account(50000);
        obj2.deposit(1000);
        obj2.withdraw(10000);
        obj2.balance();
    }
}
