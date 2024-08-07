public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int year = 1;
        double rate = 9.99;
        int loan = 1_000_000;
        System.out.println(service.calculate(year, rate, loan));
        System.out.println(service.calculate(year * 2, rate, loan));
        System.out.println(service.calculate(year * 3, rate, loan));

    }
}
