package lesson27.homework;

public class BankAccount implements PaymentSystem {
    private double sumAccount;

    public BankAccount(double sumAccount) {
        this.sumAccount = sumAccount;
    }

    @Override
    public void transferMoney(double sum) {
        sumAccount += sum;
    }

    @Override
    public void withdrawMoney(double sum) {
        if (sum >= sumAccount) {
            System.out.println("Not enough balance in account");
        } else {
            sumAccount -= sum;
        }
    }

    @Override
    public double checkBalance() {
        return sumAccount;
    }
}
