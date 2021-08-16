package Zoo;

public abstract class Animal {
    String name;
    int age;

    static int animalCount = 0;

    Animal (String name, int age){
        this.name = name;
        this.age = age;
        animalCount++;
    }

    public static void howMuchAnimals(){
        System.out.println("We created " + animalCount + " animal(s)," +
                " including  " + Cat.catCount + " cat(s) and " + Dog.dogCount + " dog(s), and they did following:");
    };
    abstract void run(int dist);
    abstract void swim(int dist);


}
