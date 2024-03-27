package lap5.part2;

public class Triangle extends Shape{
    public Triangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                '}';
    }
}
