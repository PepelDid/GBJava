package Feeding;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int decreaseFood(int n, String name) {
        if (food >= n && food  > 0){
        food -= n;
        return n;
        }else if (food == 0){
            System.out.println(name + " есть не будет, тарелка пуста");
            return 0;
        }else{
            System.out.println("В тарелке слишком мало еды," + name + " её не тронул");
            return 0;
        }

    }

    public void info() {
        System.out.println("В тарелке осталось: " + food);
    }

    public void addToPlate (int n){
        food += n;
        System.out.println("Теперь в тарелке " + food + " еды");
    }

}
