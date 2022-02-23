public class Circle extends Shape{

    private  double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public void printInfo() {
        System.out.println("Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                "} ");
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*Math.PI;
    }
}
