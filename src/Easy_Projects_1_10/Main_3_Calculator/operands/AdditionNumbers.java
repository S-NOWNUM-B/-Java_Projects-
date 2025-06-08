package operands;

import java.util.Scanner;
import java.util.Locale;

public class AdditionNumbers {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void addNumbers() {
        System.out.println("\n=== Сложение ===");
        System.out.println("1) Сложение целых чисел");
        System.out.println("2) Сложение чисел с плавающей точкой");
        System.out.println("3) Назад");
        System.out.print("Выберите операцию: ");

        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "1":
            case "сложение целых чисел":
                sumIntegers();
                break;
            case "2":
            case "сложение чисел с плавающей точкой":
                sumFloats();
                break;
            case "3":
            case "назад":
                return;
            default:
                System.out.println("\n=== ОШИБКА: Данные введены некорректно ===");
                addNumbers();
        }
    }

    private void sumIntegers() {
        System.out.print("\nВведите количество чисел для сложения: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count <= 0) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть больше 0 ===");
                sumIntegers();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            sumIntegers();
            return;
        }

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Введите число " + i + ": ");
            try {
                sum += scanner.nextInt();
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное целое число ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычислений: " + sum);
    }

    private void sumFloats() {
        System.out.print("\nВведите количество чисел для сложения: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count <= 0) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть больше 0 ===");
                sumFloats();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            sumFloats();
            return;
        }

        double sum = 0.0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Введите число " + i + ": ");
            try {
                sum += scanner.nextFloat();
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное число с плавающей точкой ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычислений: " + sum);
    }
}