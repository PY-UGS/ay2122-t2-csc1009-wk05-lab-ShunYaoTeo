import java.util.Date;
import java.lang.Math;
import java.util.Scanner;

public class GeometricObject {

    String color = "white";
    boolean filled = false;
    java.util.Date dateCreated = new Date();

    public GeometricObject(){
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString(){

        return "is created on " + this.getDateCreated() +"\nColor: " + this.getColor() + " and filled: " + this.isFilled();
    }

}
