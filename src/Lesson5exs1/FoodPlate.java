package Lesson5exs1;

public class FoodPlate extends Cat {
    int food;

    FoodPlate() {
        if (food >= 10) {
            this.food = food;
        } else {
            this.food = 0;
        }
    }

    void addFood(int amount) {
        if (amount >= 0) {
            this.food += amount;
        } else {
            System.out.println("Невозможно добавить отрицательное количество еды");
        }
    }

    void decreaseFood(int amount) {
        if (amount <= 10) {
            this.food -= amount;
        } else {
            System.out.println("Невозможно уменьшить отрицательное количество еды");
        }
    }
}
