package Zoo;

public class Dog extends Animal {
    String breed;
    static int dogCount = 0;
    static int maxRun = 500;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        dogCount++;
    }

    void swim (int dist) {
        if (dist > 10) {
            System.out.println("Sorry, " + name + " couldn't swim so far");
        } else{
            System.out.println(name + " swam " + dist +" m.");
        }
    }
}
