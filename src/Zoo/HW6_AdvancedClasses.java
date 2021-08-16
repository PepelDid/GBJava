package Zoo;

public class HW6_AdvancedClasses {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Pussy", 5, "female");
        Animal cat2 = new Cat("Felix", 7, "male");
        Animal dog1 = new Dog("King", 9, "Malamute");
        Animal dog2 = new Dog("Hugo", 3, "Bulldog");


        dog1.run(100);
        dog2.run(600);
        dog1.swim(50);
        dog2.swim(5);
        cat1.run(20);
        cat2.run(300);
        cat1.swim(50);
        cat2.swim(3);

    }
}
/*1.	Создать классы Собака и Кот с наследованием от класса Животное.
2.	Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3.	У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4.	* Добавить подсчет созданных котов, собак и животных.
*/
