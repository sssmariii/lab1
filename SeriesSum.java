public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0.0;
        double term;
        int n = 2;
        
        do {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        } while (term >= 1e-6);
        
        System.out.printf("Сумма ряда: %.6f%n", sum);
        System.out.println("Количество просуммированных членов: " + (n - 2));
    }
}