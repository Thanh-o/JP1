package lap5.part2;

public abstract class Shape {
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {

        this.color = color;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

   public abstract double getArea();

}


