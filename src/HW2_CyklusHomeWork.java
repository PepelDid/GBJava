import java.util.Scanner;

public class HW2_CyklusHomeWork {

    public static void main(String[] args){
        System.out.println("Сложу для Вас числа и скажу, правда ли,что их сумма лежит между 10 и 20. Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();;
        System.out.println (compareSumNumbers (x, y));

        System.out.println("Введите число, и я скажу, положительно оно или отрицательно");
        int z = scanner.nextInt();
        compareWithZero (z);

        System.out.println("Давайте  ещё раз я проверю ваше число на положительность, но верну Вам  правду\nесли оно отрицательно и ложь,если оно положительно.\nВведите число");
        int w = scanner.nextInt();
        System.out.println(compareWithZeroOneMore (w));

      /* Одним сканнером считать разные типы данных у меня не получилось,
       поэтому я открыла еще один.Хотя я знаю,что они едят ресурсы */
        Scanner in = new Scanner(System.in);
        System.out.println("Повторю Вашу фразу столько раз, сколько захотите\nНапечатайте её");
        String fraze = in.nextLine();
        System.out.println("Сколько раз повторить?");
        int q = scanner.nextInt();
        printMytext(fraze, q);


        System.out.println("В Древнем Риме  4, 8, 12 гг. н.э. и далее каждый четвертый год были високосными.\nВведите интересующий Вас год (от 0 г.н.э.) и я рассчитаю, високосный ли он.");
        int age = scanner.nextInt();

        System.out.println(sortOfAge (age));
    }

    public  static boolean compareSumNumbers (int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void compareWithZero (int a) {
        if (a >= 0) {
            System.out.println("Это положительное число");
        }else {
            System.out.println("Это отрицательное число");
        }
    }

    public static boolean compareWithZeroOneMore (int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printMytext (String fraze, int q) {
        int i;
        for (i = 1; i <= q; i++) {
            System.out.println(i + " строка: " + fraze);
        }
    }
    // я постаралась разбить логику на 2 блока: первое столетие и остальные
    public static boolean sortOfAge (int a) {
        if (a >99 && (a%400) !=0 && (a%100) == 0){
            return false;
        } else if ((a%=4) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
