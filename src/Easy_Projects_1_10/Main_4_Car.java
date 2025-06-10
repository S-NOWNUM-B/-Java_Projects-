package Easy_Projects_1_10;
import java.util.Scanner;

public class Main_4_Car {
    private String make;
    private String model;
    private Float speed;

    public void addCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите марку машины: ");
        this.make = scanner.nextLine().strip();

        System.out.print("Введите модель машины: ");
        this.model = scanner.nextLine().strip();

        while (true) {
            System.out.print("Введите максимальную скорость, которую хотите достичь на этой машине: ");
            if (scanner.hasNextFloat()) {
                this.speed = scanner.nextFloat();

                if (this.speed > 0) {
                    break;
                } else {
                    System.out.println("ОШИБКА: скорость должна быть больше 0. Пожалуйста, введите корректное значение.");
                }
            } else {
                System.out.println("ОШИБКА: введено не число. Пожалуйста, введите число для скорости.");
                scanner.next();
            }
        }
    }

    public void editCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите новую марку автомобиля (оставьте пустым для отмены): ");
        String newMake = scanner.nextLine().strip();
        if (!newMake.isBlank()) {
            this.make = newMake;
        }

        System.out.print("Введите новую модель автомобиля (оставьте пустым для отмены): ");
        String newModel = scanner.nextLine().strip();
        if (!newModel.isBlank()) {
            this.model = newModel;
        }

        System.out.print("Введите новую максимальную скорость автомобиля (оставьте пустым для отмены): ");
        String speedInput = scanner.nextLine().strip();
        if (!speedInput.isBlank()) {
            try {
                Float newSpeed = Float.parseFloat(speedInput);
                if (newSpeed > 0) {
                    this.speed = newSpeed;
                } else {
                    System.out.println("ОШИБКА: скорость должна быть больше 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА: введено некорректное значение скорости.");
            }
        }
        System.out.println("Данные автомобиля успешно обновлены!");
    }

    @Override
    public String toString() {
        if (this.make == null || this.make.isBlank() || this.model == null || this.model.isBlank() || this.speed == null) {
            return "Данные о машине не заполнены!";
        }
        return "Модель вашего автомобиля: " + this.make + " - " + this.model +
                ". Максимальная скорость, которую вы хотите достичь - " + this.speed + " км/ч";
    }

    public static void main(String[] args) {
        Main_4_Car car = new Main_4_Car();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1) Добавить информацию об автомобиле");
            System.out.println("2) Изменить информацию об автомобиле");
            System.out.println("3) Вывести информацию об автомобиле");
            System.out.println("4) Выйти");

            System.out.print("Выведите номер команды или саму команду: ");
            String choice = scanner.nextLine().toLowerCase().strip();

            if (choice.equals("1") || choice.equals("добавить информацию об автомобиле")) {
                car.addCar();
            } else if (choice.equals("2") || choice.equals("изменить информацию об автомобиле")) {
                car.editCar();
            } else if (choice.equals("3") || choice.equals("вывести информацию об автомобиле")) {
                System.out.println(car.toString());
            } else if (choice.equals("4") || choice.equals("выйти")) {
                System.out.println("\nВыключаюсь...");
                break;
            } else {
                System.out.println("ОШИБКА: Некорректная команда, попробуйте ещё раз");
            }
        }
    }
}