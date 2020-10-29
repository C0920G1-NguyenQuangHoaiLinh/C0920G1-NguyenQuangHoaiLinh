package _05_access_modifier_static_method_static_property.bai_tap.Access_Modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){
    }

    Circle(double r){
        this.radius = r;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.sqrt(radius)*Math.PI;
    }

}
