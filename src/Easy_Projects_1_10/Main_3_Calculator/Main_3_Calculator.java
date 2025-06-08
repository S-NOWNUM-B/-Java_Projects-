package Easy_Projects_1_10.Main_3_Calculator;

import operands.AdditionNumbers;
import operands.SubtractionNumbers;
import operands.MultiplicationNumbers;
import operands.DivisionNumbers;
import operands.ReitingFormula;
import java.util.Scanner;

class Main_3_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdditionNumbers additionNumbers = new AdditionNumbers();
        SubtractionNumbers subtractionNumbers = new SubtractionNumbers();
        MultiplicationNumbers multiplicationNumbers = new MultiplicationNumbers();
        DivisionNumbers divisionNumbers = new DivisionNumbers();
        ReitingFormula reitingFormula = new ReitingFormula();

        while (true) {
            System.out.println("\n=== Калькулятор на Java ===");
            System.out.println("1) Сложение");
            System.out.println("2) Вычитание");
            System.out.println("3) Умножение");
            System.out.println("4) Деление");
            System.out.println("5) Вычислить рейтинг предмета");
            System.out.println("6) Выход");
            System.out.print("Выберите операцию: ");

            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "1":
                case "сложение":
                    additionNumbers.addNumbers();
                    break;
                case "2":
                case "вычитание":
                    subtractionNumbers.subtractNumbers();
                    break;
                case "3":
                case "умножение":
                    multiplicationNumbers.multiplicationNumbers();
                    break;
                case "4":
                case "деление":
                    divisionNumbers.divisionNumbers();
                    break;
                case "5":
                case "вычислить рейтинг предмета":
                    reitingFormula.reitingFormula();
                    break;
                case "6":
                case "выход":
                    System.out.println("\nВыключаюсь...");
                    scanner.close();
                    return;
                default:
                    System.out.println("\n=== ОШИБКА: Данные введены некорректно ===");
            }
        }
    }
}