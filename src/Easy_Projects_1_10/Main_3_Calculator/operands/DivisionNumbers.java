package operands;

import java.util.Scanner;
import java.util.Locale;

public class DivisionNumbers {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void divisionNumbers() {
        System.out.println("\n=== Деление ===");
        System.out.println("1) Деление целых чисел (целая часть от деления)");
        System.out.println("2) Деление целых чисел (остаток от деления)");
        System.out.println("3) Деление чисел с плавающей точкой (целая часть от деления)");
        System.out.println("4) Деление чисел с плавающей точкой (остаток от деления)");
        System.out.println("5) Выйти");
        System.out.print("Выберите операцию: ");

        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "1":
            case "деление целых чисел (целая часть от деления)":
                divideIntegersQuotient();
                break;
            case "2":
            case "деление целых чисел (остаток от деления)":
                divideIntegersRemainder();
                break;
            case "3":
            case "деление чисел с плавающей точкой (целая часть от деления)":
                divideFloatsQuotient();
                break;
            case "4":
            case "деление чисел с плавающей точкой (остаток от деления)":
                divideFloatsRemainder();
                break;
            case "5":
            case "выйти":
                System.out.println("\nВыключаюсь...");
                scanner.close();
                return;
            default:
                System.out.println("\n=== ОШИБКА: Данные введены некорректно ===");
                divisionNumbers();
        }
    }

    private void divideIntegersQuotient() {
        System.out.print("\nВведите количество чисел для деления: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count < 2) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть не менее 2 ===");
                divideIntegersQuotient();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            divideIntegersQuotient();
            return;
        }

        long result = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Введите число " + i + ": ");
            try {
                int number = scanner.nextInt();
                if (i == 1) {
                    result = number;
                } else {
                    if (number == 0) {
                        System.out.println("\n=== ОШИБКА: Деление на ноль недопустимо ===");
                        scanner.nextLine();
                        divideIntegersQuotient();
                        return;
                    }
                    result /= number;
                }
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное целое число ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычислений (целая часть): " + result);
    }

    private void divideIntegersRemainder() {
        System.out.print("\nВведите количество чисел для деления: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count < 2) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть не менее 2 ===");
                divideIntegersRemainder();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            divideIntegersRemainder();
            return;
        }

        long result = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Введите число " + i + ": ");
            try {
                int number = scanner.nextInt();
                if (i == 1) {
                    result = number;
                } else {
                    if (number == 0) {
                        System.out.println("\n=== ОШИБКА: Деление на ноль недопустимо ===");
                        scanner.nextLine();
                        divideIntegersRemainder();
                        return;
                    }
                    result %= number;
                }
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное целое число ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычислений (остаток): " + result);
    }

    private void divideFloatsQuotient() {
        System.out.print("\nВведите количество чисел для деления: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count < 2) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть не менее 2 ===");
                divideFloatsQuotient();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            divideFloatsQuotient();
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
                    if (number == 0) {
                        System.out.println("\n=== ОШИБКА: Деление на ноль недопустимо ===");
                        scanner.nextLine();
                        divideFloatsQuotient();
                        return;
                    }
                    result /= number;
                }
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное число с плавающей точкой ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычислений (целая часть): " + (long)result);
    }

    private void divideFloatsRemainder() {
        System.out.print("\nВведите количество чисел для деления: ");
        int count;
        try {
            count = scanner.nextInt();
            scanner.nextLine();
            if (count < 2) {
                System.out.println("\n=== ОШИБКА: Количество чисел должно быть не менее 2 ===");
                divideFloatsRemainder();
                return;
            }
        } catch (Exception e) {
            System.out.println("\n=== ОШИБКА: Введите корректное число ===");
            scanner.nextLine();
            divideFloatsRemainder();
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
                    if (number == 0) {
                        System.out.println("\n=== ОШИБКА: Деление на ноль недопустимо ===");
                        scanner.nextLine();
                        divideFloatsRemainder();
                        return;
                    }
                    result = result - (number * Math.floorDiv((int)(result / number), 1));
                }
            } catch (Exception e) {
                System.out.println("\n=== ОШИБКА: Введите корректное число с плавающей точкой ===");
                scanner.nextLine();
                i--;
            }
        }
        scanner.nextLine();

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Результат вычислений (остаток): " + result);
    }
}