package operands;

import java.util.Scanner;
import java.util.Locale;

public class ReitingFormula {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void reitingFormula() {
        System.out.println("\n=== Расчет рейтинга ===");
        System.out.print("Введите оценку за РК1: ");
        int a = scanner.nextInt();
        System.out.print("Введите оценку за РК2: ");
        int b = scanner.nextInt();
        System.out.print("Введите оценку за экзамен: ");
        int c = scanner.nextInt();

        double avg = (a + b) / 2.0;
        double result = (avg * 0.6) + (c * 0.4);

        System.out.println("\n=== ОТВЕТ ===");
        System.out.println("Ваш рейтинг равен: " + result);

        scanner.nextLine();
    }
}