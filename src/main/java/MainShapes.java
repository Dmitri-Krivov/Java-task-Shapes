import java.util.ArrayList;
import java.util.Scanner;

public class MainShapes {
    static int option;

    public static void main(String[] args) {
        ArrayList<Shape> listOfShapes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make a choice:");
        while (true) {
            Menus.mainMenu();
            option = scanner.nextInt();
            if (option == 1) {
                Menus.shapesMenu();
                System.out.println("Choose shape");
                int ourShape = scanner.nextInt();
                System.out.println("Choose color");
                String color = scanner.next();
                if (ourShape == 1) {
                    System.out.println("Enter square width");
                    double width = scanner.nextDouble();
                    Square square = new Square(color, width);
                    listOfShapes.add(square);
                    square.printInfo();
                    System.out.println("Make a choice:");
                } else if (ourShape == 2) {
                    System.out.println("Enter rectangle width");
                    double width = scanner.nextDouble();
                    System.out.println("Enter rectangle height");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(color, width, height);
                    listOfShapes.add(rectangle);
                    rectangle.printInfo();
                    System.out.println("Make a choice:");
                } else if (ourShape == 3) {
                    System.out.println("Enter circle radius");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(color, radius);
                    listOfShapes.add(circle);
                    System.out.println("Make a choice:");
                    circle.printInfo();
                } else if (ourShape == 4) {
                    System.out.println("Enter right triangle width");
                    double width = scanner.nextDouble();
                    System.out.println("Enter right triangle height");
                    double height = scanner.nextDouble();
                    RightTriangle rightTriangle = new RightTriangle(color, width, height);
                    listOfShapes.add(rightTriangle);
                    rightTriangle.printInfo();
                    System.out.println("Make a choice:");
                }
            } else if (option == 2) {
                for (Shape shape : listOfShapes) {
                    shape.printInfo();
                }
                System.out.println("Make a choice:");
            } else if (option == 3) {
                double summary = 0;
                if (listOfShapes.size() > 0) {
                    for (Shape shape : listOfShapes) {
                        summary += shape.calculatePerimeter();
                    }
                    System.out.println("Summary of perimiters " + summary);
                } else {
                    System.out.println("No shape were added");
                    System.out.println("Make a choice:");
                }
            } else if (option == 4) {
                double summary = 0;
                if (listOfShapes.size() > 0) {
                    for (Shape shape : listOfShapes) {
                        summary += shape.calculateArea();
                    }
                    System.out.println("Summary of area " + summary);
                } else {
                    System.out.println("No shape were added");
                    System.out.println("Make a choice:");
                }
            } else if (option == 5) {

                if (listOfShapes.size() > 0) {
                    double biggest;
                    String nameOfShape = null;
                    biggest = listOfShapes.get(0).calculatePerimeter();
                    String shapeColor = null;
                    for (Shape shape : listOfShapes) {
                        if (biggest < shape.calculatePerimeter()) {
                            biggest = shape.calculatePerimeter();
                            nameOfShape = listOfShapes.get(0).getName();
                            shapeColor = listOfShapes.get(0).getColor();
                        }
                    }
                    System.out.println(" Biggest circumference has " + nameOfShape + " with " + biggest + " perimeter, with " + shapeColor + " color");
                } else {
                    System.out.println("No shape were added");
                    System.out.println("Make a choice:");
                }
            } else if (option == 6) {
                if (listOfShapes.size() > 0) {
                    double biggest;
                    String nameOfShape = null;
                    biggest = listOfShapes.get(0).calculateArea();
                    String shapeColor = null;
                    for (Shape shape : listOfShapes) {
                        if (biggest < shape.calculateArea()) {
                            biggest = shape.calculateArea();
                            nameOfShape = listOfShapes.get(0).getName();
                            shapeColor = listOfShapes.get(0).getColor();
                        }
                    }
                    System.out.println(" Biggest area has " + nameOfShape + " with " + biggest + " perimeter, with " + shapeColor + " color");
                } else {
                    System.out.println("No shape were added");
                    System.out.println("Make a choice:");
                }
            } else if (option == 7) {
                System.out.println("Good bye!");
                break;
            }
        }
    }
}
