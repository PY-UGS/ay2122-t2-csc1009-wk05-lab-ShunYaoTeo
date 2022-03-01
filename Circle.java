import java.lang.Math;

public class Circle extends GeometricObject {
    double radius;
    double PI = 3.14159265;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = this.PI * Math.pow(this.getRadius(),2);
        return area;
    }

    public double getPerimeter(){
        double peri = 2 * this.PI * this.getRadius();
        return peri;
    }

    public double getDiameter(){
        double dia = this.getRadius() * 2;
        return dia;
    }

    public void printCircle(){
        System.out.print("This is your circle!");
    }
}
