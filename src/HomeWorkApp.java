import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nAplee");
    }
    public static void checkSumSign() {
        System.out.println("Я посчитаю для Вас сумму двух чисел. Введите первое число");
        Scanner scanner = new Scanner(System.in);
        // я знаю,как использовать сканер для запроса переменных,
        // но хотела бы понять,
        // что делается под капотом,когда я его использую
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result = a + b;
        if (result > 0) {
            System.out.println("Сумма положительная и равна " + result);
        }else {
            System.out.println("Сумма отрицательная и равна " + result);
        }
    }
    public static void  printColor() {
        int value = (int)(Math.random() * 1000 - 500);
        // задала диапазон от -500 до 500
        System.out.println(value);
        if (value <= 0) {
            System.out.println("Это красный");
        }else if (value > 0 && value <= 100) {
            System.out.println("Это желтый");
        }else {
            System.out.println("Это зеленый");
        }
    }
    public static void  compareNumbers() {
        System.out.println("Я сравню для Вас два числа. Введите число a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
}
