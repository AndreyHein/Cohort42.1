package lesson27.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 27
 * @author Andrey Hein
 * @version 18-Mar-2024
 */
public class HomeWork27 {
    public static void main(String[] args) {
        // Task #1
        BankAccount account1 = new BankAccount();
        account1.depositMoney(1000);
        BankAccount account2 = new BankAccount();
        account2.depositMoney(1500);
        System.out.println("Transfer money of BankAccount!");
        account1.transferMoney(250, 0, account2);
        System.out.println("#1: " + account1.checkBalance() + " , #2: " + account2.checkBalance());

        account1.transferMoney(0, 150, account2);
        System.out.println("#1: " + account1.checkBalance() + " , #2: " + account2.checkBalance());

        ElectronicWallet wallet1 = new ElectronicWallet();
        wallet1.depositMoney(5000);
        ElectronicWallet wallet2 = new ElectronicWallet();
        wallet2.depositMoney(2500);

        wallet1.transferMoney(350, 0, wallet2);
        System.out.println("Transfer money of ElectronicWallet!");
        System.out.println("#1: " + wallet1.checkBalance() + " , #2: " + wallet2.checkBalance());
        wallet1.transferMoney(0, 150, wallet2);
        System.out.println("#1: " + wallet1.checkBalance() + " , #2: " + wallet2.checkBalance());

        // Task#2
//        Triathlete triathlete = new Triathlete();
//        triathlete.run();
//        triathlete.swim();
    }
}
