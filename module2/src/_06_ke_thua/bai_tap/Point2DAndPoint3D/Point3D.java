package _06_ke_thua.bai_tap.Point2DAndPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    float z;

    public Point3D(){
    }

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = new float[3];
        System.arraycopy(super.getXY(),0,arr,0,2);
        arr[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                ", xyz=" + Arrays.toString(getXYZ()) +
                '}';
    }
}
