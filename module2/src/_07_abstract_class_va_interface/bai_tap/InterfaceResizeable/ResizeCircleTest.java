package _07_abstract_class_va_interface.bai_tap.InterfaceResizeable;

import _06_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc.Circle;

public class ResizeCircleTest {
    public static void main(String[] args) {
       Circle[] circles = new Circle[3];

       circles[0] = new ResizeCircle();
       circles[1] = new Circle();
       circles[2] = new ResizeCircle(3.5,"blue",true);

        for (Circle circle: circles){
            System.out.println("Pre-Resizeable");
            System.out.println(circle);
            double percent = (circle.getRadius()*100)/100;
            if (circle instanceof Resizeable) {
                ((ResizeCircle) circle).resize(percent);
            }else if (circle instanceof Circle){

            }
            System.out.println("After-Resizeable");
            System.out.println(circle);
            System.out.println("------------------------------------");
        }
    }
}
