public abstract class Shape  implements Calculator{
    protected String color;
    protected String name;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Shape(String color) {
        this.color = color;
    }

   public abstract  void printInfo();
}
