public class Rectangle extends GeometricObject{
    double width;
    double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        double area = this.getHeight() * this.getWidth();
        return area;
    }

    public double getPerimeter(){
        double peri = (2*this.getWidth()) + (2*this.getHeight());
        return peri;
    }
}
