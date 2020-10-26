package _04_lop_va_huong_doi_tuong.bai_tap;

public class BuildFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    BuildFan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public BuildFan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "BuildFan{" +
                    "SLOW=" + SLOW +
                    ", MEDIUM=" + MEDIUM +
                    ", FAST=" + FAST +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color +
                    ", fan is on" + '\'' +
                    '}';
        } else {
            return "BuildFan{" +
                    "SLOW=" + SLOW +
                    ", MEDIUM=" + MEDIUM +
                    ", FAST=" + FAST +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color +
                    ", fan is off" + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        BuildFan fan1 = new BuildFan(3, true, 10, "yellow");
        System.out.println(fan1);
        BuildFan fan2 = new BuildFan();
        fan2.setSpeed(2);
        System.out.println(fan2);
    }
}
