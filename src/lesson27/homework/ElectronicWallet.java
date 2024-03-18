package lesson27.homework;

public class ElectronicWallet implements PaymentSystem {
    private double sumWallet;

    public ElectronicWallet(double sumWallet) {
        this.sumWallet = sumWallet;
    }

    @Override
    public void transferMoney(double sum) {
        sumWallet += sum;
    }

    @Override
    public void withdrawMoney(double sum) {
        if (sum >= sumWallet) {
            System.out.println("Not enough balance in account");
        } else {
            sumWallet -= sum;
        }
    }

    @Override
    public double checkBalance() {
        return sumWallet;
    }
}
