public class CreditPaymentService {
    public double calculate(int credit, int month, double percent) {
        double payment = credit * (((percent / 12) * Math.pow(1 + (percent / 12), month)) / (Math.pow(1 + (percent / 12), month) - 1));
        return (int) payment;
    }
}
