package Lesson5exs2;

class Rectangle implements Shape {
    private final int width;
    private final int lenght;
    private final String borderColor;
    private final String fillColor;

    Rectangle(int width, int lenght, String borderColor, String fillColor) {
        this.width = width;
        this.lenght = lenght;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + lenght);
    }

    @Override
    public double getArea() {
        return width * lenght;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }
}
