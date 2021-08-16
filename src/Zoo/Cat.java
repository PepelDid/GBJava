package Zoo;

public class Cat extends Animal {
    String sex;
    static int catCount = 0;
    static int maxRun = 200;

    public Cat(String name, int age, String sex){
        super(name, age);
        this.sex = sex;
        catCount++;
    }

    void swim (int dist){
        System.out.println("Sorry, " + name + " is a cat and it can't swim");
    }



}
