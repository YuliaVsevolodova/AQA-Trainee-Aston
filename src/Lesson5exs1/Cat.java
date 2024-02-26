package Lesson5exs1;

public class Cat extends Animal {
    static int catCount = 0;
    private boolean fed = false;

    @Override
    public void run(int lenght) {
        if (lenght <= 200) {
            System.out.println("Кот пробежал " + lenght + " м.");
        } else {
            System.out.println("Кот не может пробежать такую дистанцию");
        }
    }

    @Override
    public void swim(int lenght) {
        System.out.println("Кот не умеет плавать");
    }

    public void eat(FoodPlate plate, int amount) {
        if (amount <= plate.food) {
            plate.decreaseFood(amount);
            fed = true;
            System.out.println("Кот съел " + amount + " еды");
        } else {
            System.out.println("Недостаточно еды, пополните миску");
        }
    }

    boolean isFed() {
        return fed;
    }
}
