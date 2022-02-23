public class RightTriangle extends Shape {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public RightTriangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
        this.name = "RightTriangle";
    }

    @Override
    public void printInfo() {
        System.out.println("RightTriangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                "} ");
    }

    @Override
    public double calculateArea() {
        return height*width/2;
    }

    @Override
    public double calculatePerimeter() {
        return height+width+Math.sqrt(Math.pow(height, 2) + Math.pow(width,2));
    }
}
