public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000; // Сумма кредита
        double rate = 9.99; // Поцентная ставка
        double time1 = 1; // Срок кредита 1 год
        double payment1 = service.calculate(credit, rate, time1);
        int fPayment1 = (int) payment1; // Приведение типов данных
        System.out.println("Месячный платеж составит " + fPayment1);

        double time2 = 2; // Срок кредита 2 года
        double payment2 = service.calculate(credit, rate, time2);
        int fPayment2 = (int) payment2; // Приведение типов данных
        System.out.println();
        System.out.println("Месячный платеж составит " + fPayment2);

        double time3 = 3; // Срок кредита 3 года
        double payment3 = service.calculate(credit, rate, time3);
        int fPayment3 = (int) payment3; // Приведение типов данных
        System.out.println();
        System.out.println("Месячный платеж составит " + fPayment3);
    }
}
