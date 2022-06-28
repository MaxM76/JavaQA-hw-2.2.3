public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditPeriodInYears = 1;
        int creditAmount = 1_000_000;
        float creditAnnualRate = (float) 9.99;
        System.out.println("Сумма кредита: " + creditAmount + " руб.");
        System.out.println("Срок кредита: " + creditPeriodInYears+ " год(а)");
        System.out.println("Процентная ставка: " + creditAnnualRate + "%");
        System.out.println("Ежемесячный платеж: " +
                (int) service.calculate(creditAmount, creditPeriodInYears, creditAnnualRate) + " руб.");
        System.out.println();
        creditPeriodInYears = 2;
        System.out.println("Сумма кредита: " + creditAmount + " руб.");
        System.out.println("Срок кредита: " + creditPeriodInYears+ " год(а)");
        System.out.println("Процентная ставка: " + creditAnnualRate + "%");
        System.out.println("Ежемесячный платеж: " +
                (int) service.calculate(creditAmount, creditPeriodInYears, creditAnnualRate) + " руб.");
        System.out.println();
        creditPeriodInYears = 3;
        System.out.println("Сумма кредита: " + creditAmount + " руб.");
        System.out.println("Срок кредита: " + creditPeriodInYears+ " год(а)");
        System.out.println("Процентная ставка: " + creditAnnualRate + "%");
        System.out.println("Ежемесячный платеж: " +
                (int) service.calculate(creditAmount, creditPeriodInYears, creditAnnualRate) + " руб.");
    }
}
