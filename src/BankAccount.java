public class BankAccount {

    double balance;

    void deposit(double sum) {
        balance += sum;
    }

    void withdrawal(double sum) {
        balance -= sum;
    }
}

class BalanceTEst {

    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.deposit(1100);
        bA.withdrawal(99);
        System.out.println(bA.balance);
    }

}
