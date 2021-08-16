package Zoo;


public class Dog extends Animal {
    String breed;
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    void run (int dist) {
        if (dist > 500) {
            System.out.println("Sorry, " + name + " couldn't run so far");
        } else {
            System.out.println(name + " run " + dist +" m.");
        }
    }
    void swim (int dist) {
        if (dist > 10) {
            System.out.println("Sorry, " + name + " couldn't swim so far");
        } else{
            System.out.println(name + " swam " + dist +" m.");
        }
    }
}
