public class Square extends Shape{
    private double width;
//    private final String name = "Square";

    public Square(String color, double width) {
        super(color);
        this.width = width;
        this.name = "Square";

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void printInfo() {
        System.out.println("Square{" +
                "color='" + color + '\'' +
                ", width=" + width +
                "} ");
    }

    @Override
    public double calculateArea() {
        return width*width;
    }

    @Override
    public double calculatePerimeter() {
        return width*4;
    }
}
