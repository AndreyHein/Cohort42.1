package lesson27.homework;

public class ElectronicWallet implements PaymentSystem {

    private double balance;

    @Override
    public void transferMoney(double debit, double credit, PaymentSystem wallet) {
        if (debit > 0) {
            balance -= debit;
            wallet.depositMoney(debit);
        } else if (credit > 0) {
            balance += credit;
            wallet.withdrawMoney(credit);
        }
    }

    @Override
    public void depositMoney(double money) {
        balance += money;
    }

    @Override
    public void withdrawMoney(double money) {
        if (money >= balance) {
            System.out.println("Not enough balance in account");
        } else {
            balance -= money;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
