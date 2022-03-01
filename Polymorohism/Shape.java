package Polymorohism;

import java.lang.Math;

abstract class Shape {
    double dim1;
    double dim2;
    double PI = 3.14159265;

    public Shape(){

    }

    public abstract double area();
}

class Rectangle extends Shape {

    public Rectangle(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    @Override
    public double area() {
        double area = this.dim1*this.dim2;
        return area;
    }

}

class Triangle extends Shape{

    public Triangle(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public double area() {
        double area = 0.5 * this.dim1 * this.dim2;
        return area;
    }
}

class Circle extends Shape{

    public Circle(double dim1) {
      this.dim1 = dim1;
    }

    @Override
    public double area() {
        double area = this.PI * Math.pow(this.dim1,2);
        return area;
    }
}

class Ellipse extends Shape{
    public Ellipse(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public double area() {
       double area = this.PI * this.dim1 * this.dim2;
        return area;
    }
}

class Square extends Shape{
    public Square(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public double area() {
        double area = this.dim1 * this.dim2;
        return area;
    }
}