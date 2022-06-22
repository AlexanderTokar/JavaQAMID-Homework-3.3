public class CreditPaymentService {
    public double calculate (double credit, double rate, double time) {
        double n = time * 12; // количество платежей
        double m = (rate / 12) / 100; // месячная ставка
        double x = 1 + m; // Вспомогательная переменная для расчет коэффицициента аннуитета
        double y = Math.pow(x, n);
        double anFactor = (m * y) / (y - 1); // Расчет коэффициента аннуитета
        return credit * anFactor;
    }
}
