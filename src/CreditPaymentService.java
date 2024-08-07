public class CreditPaymentService {
    public double calculate(int year, double rate, double loan) {
        double payment;
        int month = year * 12;
        double rateMonth=rate/12/100;
        double coefficient = rateMonth * Math.pow((1 + rateMonth), month) / (Math.pow((1 + rateMonth), month) - 1);
        payment = coefficient*loan;

        return Math.round(payment);
    }
}
