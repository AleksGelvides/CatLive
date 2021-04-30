import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean program = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в CatLive!");
        System.out.println("Давайте создадим вашего первого питомца");
//        Создаем кота:
        Cat cat1 = new Cat();
        System.out.print("Введите имя вашего питомца: ");
        cat1.name = scanner.nextLine();
        cat1.age = 0;
        cat1.hunger = true;
        cat1.healths = true;
//        Кота создали.
//        Меню состояния кота
        while (program) {
            System.out.println("Мой кот: " + cat1.name);
            int variants = 0;
            while (variants < 3) {
                cat1.catAges();
            System.out.println("Давайте посмотрим на стостояние нашего кота.");
            System.out.println("Выберите и ввведите пункт меню, для обзора действий с котом:");
            System.out.println("1. Состояние кота");
            System.out.println("2. Кормление кота");
            System.out.println("3. Сводить кота к ветеринару");
            variants = scanner.nextInt();
            switch (variants){
                case 1:
                    System.out.println("Возраст кота: " + cat1.age);
                    System.out.println("Голод кота: " + cat1.hunger);
                    System.out.println("Здоровье кота: " + cat1.healths);
            }
                System.out.println("D - Далее");
            char d  = scanner.next().charAt(0);
            if (d == 'D'){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                variants = 0;
                break;
            }
            }
        }
    }
}
