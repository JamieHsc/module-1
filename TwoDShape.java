package JH.Module14;

abstract class TwoDShape {
    private double width;
    private double height;
    private Colour colour;

    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public TwoDShape(Colour colour) {
        this.width = 0.0;
        this.height = 0.0;
        this.colour = colour;
    }

    public abstract double getArea();

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public Colour getColour() {
        return colour;
    }

    public abstract String toString();
}

