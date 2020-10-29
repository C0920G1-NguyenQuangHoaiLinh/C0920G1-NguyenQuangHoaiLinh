package _05_access_modifier_static_method_static_property.bai_tap.Access_Modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.getRadius();
        circle.getArea();

        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
    }
}
