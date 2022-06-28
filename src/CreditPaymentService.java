public class CreditPaymentService {
    double calculate(int amount, int period, float rate) {
        int periodInMonths = period * 12;
        float monthlyRate = rate / (100 * 12);
        return amount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -periodInMonths));
    }
}
