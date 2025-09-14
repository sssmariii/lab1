import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Решение квадратного уравнения ax^2 + bx + c = 0");
        
        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();
        
        // Вычисляем дискриминант
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant < 0) {
            System.out.println("Нет вещественных корней");
        } else {
            // Вычисляем корни
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            System.out.println("Корни уравнения:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        
        scanner.close();
    }
}
