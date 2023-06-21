package JH.Module14;

class Triangle extends TwoDShape implements Rotate {
    private double side;
    private double side2;
    private double side3;
    private double angle;

    public Triangle(double side, double side2, double side3, Colour colour) {
        super(colour);
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight());
    }

    private double heronsHeight() {
        double s = (side + side2 + side3) / 2;
        return (2 * Math.sqrt(s * (s - side) * (s - side2) * (s - side3))) / side;
    }

    @Override
    public double getArea() {
        return (getWidth() * getHeight()) / 2;
    }

    @Override
    public String toString() {
        return "Triangle: side=" + side + ", side2=" + side2 + ", side3=" + side3 + ", area=" + getArea()
                + ", colour=" + getColour();
    }

    @Override
    public void rotate90() {
        angle += 90;
        angle %= 360;
    }

    @Override
    public void rotate180() {
        angle += 180;
        angle %= 360;
    }

    @Override
    public void rotate(double degree) {
        angle += degree;
        angle %= 360;
    }
}