package Lesson5exs2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4, "Красный", "Синий");
        System.out.println("Периметр круга равен " + circle.getPerimeter());
        System.out.println("Площадь круга равна " + circle.getArea());
        System.out.println("Цвет границ круга " + circle.getBorderColor());
        System.out.println("Цвет заливки круга " + circle.getFillColor());

        Shape rectangle = new Rectangle(3, 4, "Зелёный", "Красный");
        System.out.println("Периметр прямоугольника равен " + rectangle.getPerimeter());
        System.out.println("Площадь прямоугольника равна " + rectangle.getArea());
        System.out.println("Цвет границ прямоугольника " + rectangle.getBorderColor());
        System.out.println("Цвет заливки прямоугольника " + rectangle.getFillColor());

        Shape triangle = new Triangle(3, 4, 5, "Синий", "Красный");
        System.out.println("Периметр треугольника равен " + triangle.getPerimeter());
        System.out.println("Площадь треугольника равна " + triangle.getArea());
        System.out.println("Цвет границ треугольника " + triangle.getBorderColor());
        System.out.println("Цвет заливки треугольника " + triangle.getFillColor());
    }
}
