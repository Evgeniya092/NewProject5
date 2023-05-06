public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int month = 12;
        double percent = 0.0999;
        double payment = service.calculate(credit,month,percent);
        System.out.println(payment);

        System.out.println();
        System.out.println(service.calculate(1_000_000, 24, 0.0999));

        System.out.println();
        System.out.println(service.calculate(1_000_000, 36, 0.0999));

        }
    }