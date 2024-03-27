package lap5.part2;

public class Rectangle extends Shape {
    private String length;
    private String width;

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length='" + length + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
