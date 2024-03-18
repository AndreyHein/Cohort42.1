package lesson27.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 27
 * @author Andrey Hein
 * @version 18-Mar-2024
 */
public class HomeWork27 {
    public static void main(String[] args) {
        // Task #1
        BankAccount bankAccount = new BankAccount(5000);
        ElectronicWallet electronicWallet = new ElectronicWallet(1000);

        System.out.println("Bank account balance: " + bankAccount.checkBalance());
        System.out.println("Electronic wallet balance: " + electronicWallet.checkBalance());

        bankAccount.withdrawMoney(1000);
        electronicWallet.withdrawMoney(600);
        System.out.println("Bank account balance: " + bankAccount.checkBalance());
        System.out.println("Electronic wallet balance: " + electronicWallet.checkBalance());

        bankAccount.transferMoney(500);
        electronicWallet.transferMoney(700);
        System.out.println("Bank account balance: " + bankAccount.checkBalance());
        System.out.println("Electronic wallet balance: " + electronicWallet.checkBalance());

        // Task#2
        Triathlete triathlete = new Triathlete();
        triathlete.run();
        triathlete.swim();
    }
}
