package operands;

import java.util.Scanner;
import java.util.Locale;

public class SubtractionNumbers {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void subtractNumbers() {
        System.out.println("\n=== Вычитание ===");
        System.out.println("1) Вычитание целых чисел");
        System.out.println("2) Вычитание чисел с плавающей точкой");
        System.out.println("3) Назад");
        System.out.print("Выберите операцию: ");

        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "1":
            case "вычитание целых чисел":
                subIntegers();
                break;
            case "2":
            case "вычитание чисел с плавающей точкой":
                subFloats();
                break;
            case "3":
            case "назад":
                return;
            default:
                System.out.println("\n=== ОШИБКА: Данные введены некорректно ===");
                subtractNumbers();
        }
    }

    private void subIntegers() {
        System.out.print("\nВведите количество чисел для вычитания: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count <= 0) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть больше 0 ===");
                subIntegers();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            subIntegers();
            return;
        }

        int result = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Введите число " + i + ": ");
            try {
                int number = scanner.nextInt();
                if (i == 1) {
                    result = number;
                } else {
                    result -= number;
                }
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное целое число ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычитания: " + result);
    }

    private void subFloats() {
        System.out.print("\nВведите количество чисел для вычитания: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count <= 0) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть больше 0 ===");
                subFloats();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            subFloats();
            return;
        }

        double result = 0.0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Введите число " + i + ": ");
            try {
                float number = scanner.nextFloat();
                if (i == 1) {
                    result = number;
                } else {
                    result -= number;
                }
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное число с плавающей точкой ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.printf("Результат вычитания: %.2f%n", result);
    }
}