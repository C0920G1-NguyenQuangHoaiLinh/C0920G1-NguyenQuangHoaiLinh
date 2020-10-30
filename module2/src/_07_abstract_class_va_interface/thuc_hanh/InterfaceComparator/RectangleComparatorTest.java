package _07_abstract_class_va_interface.thuc_hanh.InterfaceComparator;

import _06_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3,6);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(2,4,"blue",true);

        System.out.println("Pre-sorted: ");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("After-sorted");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
