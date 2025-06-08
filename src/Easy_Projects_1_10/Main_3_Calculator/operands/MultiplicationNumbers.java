package operands;

import java.util.Scanner;
import java.util.Locale;

public class MultiplicationNumbers {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void multiplicationNumbers() {
        System.out.println("\n=== Умножение ===");
        System.out.println("1) Умножение целых чисел");
        System.out.println("2) Умножение чисел с плавающей точкой");
        System.out.println("3) Назад");
        System.out.print("Выберите операцию: ");

        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "1":
            case "умножение целых чисел":
                multiplyIntegers();
                break;
            case "2":
            case "умножение чисел с плавающей точкой":
                multiplyFloats();
                break;
            case "3":
            case "назад":
                return;
            default:
                System.out.println("\n=== ОШИБКА: Данные введены некорректно ===");
                multiplicationNumbers();
        }
    }

    private void multiplyIntegers() {
        System.out.print("\nВведите количество чисел для умножения: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count <= 0) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть больше 0 ===");
                multiplyIntegers();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            multiplyIntegers();
            return;
        }

        long product = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print("Введите число " + i + ": ");
            try {
                product *= scanner.nextInt();
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное целое число ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычислений: " + product);
    }

    private void multiplyFloats() {
        System.out.print("\nВведите количество чисел для умножения: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count <= 0) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть больше 0 ===");
                multiplyFloats();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            multiplyFloats();
            return;
        }

        double product = 1.0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Введите число " + i + ": ");
            try {
                product *= scanner.nextFloat();
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное число с плавающей точкой ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычислений: " + product);
    }
}