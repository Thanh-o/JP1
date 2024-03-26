package lap5.part2;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    abstract public String toString();
}

}
