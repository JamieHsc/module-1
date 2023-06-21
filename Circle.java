package JH.Module14;

class Circle extends TwoDShape {
    private final double PI = 3.14159;
    private double radius;

    public Circle(double radius, Colour colour) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius=" + radius + ", area=" + getArea() + ", colour=" + getColour();
    }
}