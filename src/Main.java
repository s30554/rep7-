//zadanie.1

import java.util.ArrayList;
interface Figure{
    double getPerimeter();
    double getArea();
    String getType();
}

//zadanie.2
interface Moveable{
    void start();
    void stop();
}

public class Main {
    public static void main(String[] args) {
        //zadanie.1
        double radius = 3d;
        Figure circle = new Circle(radius);
        double baseSide = 10d;
        double side = 5d;
        double height = 8d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);
        double sideA = 15d;
        double sideB = 10d;
        Figure rectangle = new Rectangle(sideA, sideB);

        ArrayList<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
        }

        //zadanie.2
        Cat majkel = new Cat("Majkel");
        majkel.start();
        System.out.println(majkel.getType());
        majkel.stop();

    }

}