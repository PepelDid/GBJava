package Feeding;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
           new Cat ("Barsik", 5),
           new Cat("Murzik", 10),
           new Cat("Leva", 9),
           new Cat ("Ryzhik", 5),
           new Cat("Shatun", 4),
        };
        Plate plate = new Plate(20);

        for (int i = 0; i < cats.length; i++) {
           cats[i].eat(plate);
           plate.info();
       }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько добавим кошкам еды в тарелку?");
        int x = scanner.nextInt();
        plate.addToPlate(x);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
        }
        //наверное,есть какой-нибудь репитер куска кода,но я его не знаю
    }
}
