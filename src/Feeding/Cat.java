package Feeding;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    public void eat(Plate plate) {
        int x = plate.decreaseFood(appetite, name);
        if (x != 0) {
            satiety = true;
            System.out.println(name + " поел и он " + satiety);
        }else{
            System.out.println(name + " не поел и он " + satiety);
        }
    }

    /* Возможен такой вариант:
     в классе Main
     for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].syt();
            plate.info();

        }

     в классе Cat
    public void eat(Plate plate) {
        int x = plate.decreaseFood(appetite, name);
        if (x != 0) {
            satiety = true;
        }
    }

        public void syt() {
            System.out.println(name + " is " + satiety);
        }*/


}
