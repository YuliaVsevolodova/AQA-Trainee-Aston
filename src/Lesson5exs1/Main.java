package Lesson5exs1;

public class Main {
    public static void main(String[] args) {
        Dog.dogCount++;
        Cat.catCount++;
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.run(200);
        dog.swim(9);
        cat.run(100);
        cat.swim(3);
        FoodPlate catFoodPlate = new FoodPlate();
        Cat[] cats = new Cat[3];
        for (int i = 0; i < 3; i++) {
            cats[i] = new Cat();
            Cat.catCount++;
        }
        for (Cat oneCat : cats) {
            oneCat.eat(catFoodPlate, 8);
        }
        catFoodPlate.addFood(10);
        for (Cat oneCat : cats) {
            oneCat.eat(catFoodPlate, 8);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + " наевся " + cats[i].isFed());
        }
    }
}
