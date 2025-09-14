import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите строку для проверки: ");
        String input = scanner.nextLine();
        
        // Приводим к нижнему регистру и удаляем все пробелы и знаки препинания
        String cleaned = input.toLowerCase().replaceAll("[^a-zа-я0-9]", "");
        
        // Проверяем, является ли очищенная строка палиндромом
        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка НЕ является палиндромом");
        }
        
        scanner.close();
    }
}
