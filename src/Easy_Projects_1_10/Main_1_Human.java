package Easy_Projects_1_10;
import java.util.Scanner;

public class Main_1_Human {
    private String name;
    private String age;

    public Main_1_Human() {
        this.name = null;
        this.age = null;
    }

    public void addHuman() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя - ");
        this.name = scanner.nextLine().strip();

        System.out.print("Введите ваш возраст - ");
        this.age = scanner.nextLine().strip();

        try {
            Integer.parseInt(this.age);
            System.out.println("Данные сохранены");
        } catch (NumberFormatException e) {
            System.out.println("ПРЕДУПРЕЖДЕНИЕ: Возраст должен быть числом!");
            this.age = null;
        }
    }

    public void editName(String newName) {
        if (newName != null && !newName.equals(this.name)) {
            this.name = newName;
            System.out.println("Новое имя сохранено");
        } else {
            System.out.println("ОШИБКА: Данное имя уже зарегистрировано или некорректно");
        }
    }

    public void editAge(String newAge) {
        try {
            Integer.parseInt(newAge);
            if (newAge != null && !newAge.equals(this.age)) {
                this.age = newAge;
                System.out.println("Новый возраст сохранен");
            } else {
                System.out.println("ОШИБКА: Данный возраст уже зарегистрирован");
            }
        } catch (NumberFormatException e) {
            System.out.println("ОШИБКА: Возраст должен быть числом!");
        }
    }

    @Override
    public String toString() {
        if (name == null || age == null) {
            return "Данные о человеке не заполнены";
        }
        return "Вас зовут - " + name + " и вам " + age + " лет";
    }

    public static void main(String[] args) {
        Main_1_Human human = new Main_1_Human();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1) Добавить информацию о человеке");
            System.out.println("2) Вывести информацию о человеке");
            System.out.println("3) Изменить имя");
            System.out.println("4) Изменить возраст");
            System.out.println("5) Выйти");

            System.out.print("Введите номер команды или саму команду - ");
            String choice = scanner.nextLine().toLowerCase().strip();

            if (choice.equals("1") || choice.equals("добавить информацию о человеке")) {
                human.addHuman();
            } else if (choice.equals("2") || choice.equals("вывести информацию о человеке")) {
                System.out.println(human);
            } else if (choice.equals("3") || choice.equals("изменить имя")) {
                System.out.print("Введите новое имя: ");
                String newName = scanner.nextLine().strip();
                human.editName(newName);
            } else if (choice.equals("4") || choice.equals("изменить возраст")) {
                System.out.print("Введите новый возраст: ");
                String newAge = scanner.nextLine().strip();
                human.editAge(newAge);
            } else if (choice.equals("5") || choice.equals("выйти")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("ОШИБКА: Вы ввели некорректную команду, попробуйте ещё раз.");
            }
        }
    }
}