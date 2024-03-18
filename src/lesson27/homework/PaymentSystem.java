package lesson27.homework;

public interface PaymentSystem {
    void transferMoney(double sum);

    void withdrawMoney(double sum);

    double checkBalance();
}
