package Easy_Projects_1_10;

import java.util.Scanner;

public class Main_2_Triangle {
    public void submenu_equilateral() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ РАВНОСТОРОННЕГО ТРЕУГОЛЬНИКА ===");
            System.out.println("1) Площадь через длину стороны");
            System.out.println("2) Назад");

            System.out.print("Введите номер команды или саму команду: ");
            String choice = scanner.nextLine().toLowerCase().strip();

            if (choice.equals("1") || choice.equals("площадь через длину стороны")) {
                System.out.print("Введите размер стороны: ");
                float a = scanner.nextFloat();
                scanner.nextLine();

                float result = (float) (Math.sqrt(3) / 4 * a * a);
                System.out.println("Результат вычислений: " + result);
            } else if (choice.equals("2") || choice.equals("назад")) {
                return;
            } else {
                System.out.println("ОШИБКА: Вы ввели некорректную команду, попробуйте ещё раз");
            }
        }
    }

    public void submenu_isosceles() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ РАВНОБЕДРЕННОГО ТРЕУГОЛЬНИКА ===");
            System.out.println("1) Площадь через основание и высоту");
            System.out.println("2) Площадь через сторону и высоту");
            System.out.println("3) Назад");

            System.out.print("Введите номер команды или саму команду: ");
            String choice = scanner.nextLine().toLowerCase().strip();

            if (choice.equals("1") || choice.equals("площадь через основание и высоту")) {
                System.out.print("Введите размер основания: ");
                float a = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Введите размер высоты: ");
                float h = scanner.nextFloat();
                scanner.nextLine();

                float result = a * h / 2;
                System.out.println("Результат вычислений: " + result);
            } else if (choice.equals("2") || choice.equals("площадь через сторону и высоту")) {
                System.out.print("Введите размер стороны: ");
                float a = scanner.nextFloat();
                scanner.nextLine();

                float result = (float) (a * a * Math.sqrt(3) / 4);
                System.out.println("Результат вычислений: " + result);
            } else if (choice.equals("3") || choice.equals("назад")) {
                return;
            } else {
                System.out.println("ОШИБКА: Вы ввели некорректную команду, попробуйте ещё раз");
            }
        }
    }

    public void submenu_right() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ ПРЯМОУГОЛЬНОГО ТРЕУГОЛЬНИКА ===");
            System.out.println("1) Площадь через катет и высоту");
            System.out.println("2) Площадь через две стороны");
            System.out.println("3) Площадь через формулу Герона");
            System.out.println("4) Назад");

            System.out.print("Введите номер команды или саму команду: ");
            String choice = scanner.nextLine().toLowerCase().strip();

            if (choice.equals("1") || choice.equals("площадь через катет и высоту")) {
                System.out.print("Введите размер катета: ");
                float a = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Введите размер высоты: ");
                float h = scanner.nextFloat();
                scanner.nextLine();

                float result = a * h / 2;
                System.out.println("Результат вычислений: " + result);
            } else if (choice.equals("2") || choice.equals("площадь через две стороны")) {
                System.out.print("Введите размер первого катета: ");
                float a = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Введите размер второго катета: ");
                float b = scanner.nextFloat();
                scanner.nextLine();

                float result = a * b / 2;
                System.out.println("Результат вычислений: " + result);
            } else if (choice.equals("3") || choice.equals("площадь через формулу герона")) {
                System.out.print("Введите размер первой стороны: ");
                float a = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Введите размер второй стороны: ");
                float b = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Введите размер третьей стороны: ");
                float c = scanner.nextFloat();
                scanner.nextLine();

                float p = (a + b + c) / 2;
                float result = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Результат вычислений: " + result);
            } else if (choice.equals("4") || choice.equals("назад")) {
                return;
            } else {
                System.out.println("ОШИБКА: Вы ввели некорректную команду, попробуйте ещё раз");
            }
        }
    }

    public static void main(String[] args) {
        Main_2_Triangle triangle = new Main_2_Triangle();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1) Рассчитать площадь равностороннего треугольника");
            System.out.println("2) Рассчитать площадь равнобедренного треугольника");
            System.out.println("3) Рассчитать площадь прямоугольного треугольника");
            System.out.println("4) Выйти из программы");

            System.out.print("Введите номер команды или саму команду: ");
            String choice = scanner.nextLine().toLowerCase().strip();

            if (choice.equals("1") || choice.equals("рассчитать площадь равностороннего треугольника")) {
                triangle.submenu_equilateral();
            } else if (choice.equals("2") || choice.equals("рассчитать площадь равнобедренного треугольника")) {
                triangle.submenu_isosceles();
            } else if (choice.equals("3") || choice.equals("рассчитать площадь прямоугольного треугольника")) {
                triangle.submenu_right();
            } else if (choice.equals("4") || choice.equals("выйти из программы")) {
                System.out.println("\nВыключаюсь...");
                break;
            } else {
                System.out.println("ОШИБКА: Вы ввели некорректную команду, попробуйте ещё раз");
            }
        }
    }
}