package Lesson5exs1;

public class Animal {
    static int animalCount = 0;

    public void run(int lenght) {
        System.out.println("Животное пробежало " + lenght + "метров");
    }

    public void swim(int lenght) {
        System.out.println("Животное проплыло " + lenght + "метров");
    }
}
