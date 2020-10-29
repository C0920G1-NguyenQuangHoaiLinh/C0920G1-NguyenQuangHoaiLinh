package _06_ke_thua.bai_tap.PointAndMoveablePoint;

import _06_ke_thua.bai_tap.Point2DAndPoint3D.Point2D;

import java.util.Arrays;

public class MoveablePoint extends Point2D {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    MoveablePoint(){
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    public void setSpeed(float xSpeed,float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xy=" + Arrays.toString(getXY()) +
                ", Speed=" + Arrays.toString(getSpeed()) +
                '}';
    }

    public MoveablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint move = new MoveablePoint(2,3,4,5);
        System.out.println(move);
        System.out.println(move.move());
    }
}
