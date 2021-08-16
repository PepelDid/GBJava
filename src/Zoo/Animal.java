package Zoo;

public abstract class Animal {
    String name;
    int age;

    Animal (String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void run(int dist);
    abstract void swim(int dist);

}
