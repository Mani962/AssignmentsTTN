package com.designpatterns;

//Implementor
interface Color {
    String getColorType();
}

//Concrete Implementor
class Blue implements Color {
    @Override
    public String getColorType() {
        return "blue";
    }
}

//Concrete Implementor
class Red implements Color {
    @Override
    public String getColorType() {
        return "red";
    }
}

//Concrete Implementor
class Pink implements Color {
    @Override
    public String getColorType() {
        return "pink";
    }
}

//Abstraction
abstract class Shape {

    protected int noOfSide;
    protected Color color;


    public Shape(int noOfSide, Color color) {
        this.noOfSide = noOfSide;
        this.color = color;
    }
}

//Refined Abstraction
class Square extends Shape {

    public Square(Color color) {
        super(4, color);
    }

    @Override
    public String toString() {
        return "Square{" +
                "noOfSide=" + noOfSide +
                ", color=" + color.getColorType() +
                '}';
    }
}

//Refined Abstraction
class Triangle extends Shape {

    public Triangle(Color color) {
        super(3, color);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "noOfSide=" + noOfSide +
                ", color=" + color.getColorType() +
                '}';
    }
}

public class q5 {

    public static void main(String[] args) {

        Square square = new Square(new Pink());
        System.out.println(square);
        Square square1 = new Square(new Blue());
        System.out.println(square1);
        Triangle triangle = new Triangle(new Blue());
        System.out.println(triangle);
    }
}