package JH.Module14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();

        Triangle triangle = new Triangle(3, 4, 5,Colour.RED);
        shapes.add(triangle);

        Circle circle = new Circle(2.5,Colour.GREEN);
        shapes.add(circle);

        for (TwoDShape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}