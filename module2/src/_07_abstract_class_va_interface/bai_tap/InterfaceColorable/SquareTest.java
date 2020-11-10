package _07_abstract_class_va_interface.bai_tap.InterfaceColorable;

import _06_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc.Square;

import java.util.Arrays;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];

        squares[0] = new SquareColorable();
        squares[1] = new SquareColorable(4, "blue",true);
        squares[2] = new Square();

        for (Square square: squares){
            String howToColor = "Color all four sides..";
            System.out.println(square.toString());
            if (square instanceof SquareColorable){
                System.out.println(((SquareColorable) square).howToColor());
            }
        }
    }
}
