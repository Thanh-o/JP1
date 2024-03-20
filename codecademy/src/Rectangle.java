public class Rectangle {
    private int width, height;

    public Rectangle( int height, int width ) {
        this.width = width;
        this.height = height;
    }

    public void display() {
        for (int j = 0; j < width; j++) {
        for (int i = 0; i < height; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle;
        rectangle = new Rectangle(7, 3);
        rectangle.display();
    }
}





