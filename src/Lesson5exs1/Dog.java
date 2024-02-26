package Lesson5exs1;

public class Dog extends Animal {
    static int dogCount = 0;

    @Override
    public void run(int lenght) {
        if (lenght <= 500) {
            System.out.println("Собака пробежала " + lenght + " м.");
        } else {
            System.out.println("Собака не может пробежать такую дистанцию");
        }
    }

    @Override

    public void swim(int lenght) {
        if (lenght <= 10) {
            System.out.println("Собака проплыла " + lenght + " м.");
        } else {
            System.out.println("Собака не может так далеко плыть");
        }
    }
}


