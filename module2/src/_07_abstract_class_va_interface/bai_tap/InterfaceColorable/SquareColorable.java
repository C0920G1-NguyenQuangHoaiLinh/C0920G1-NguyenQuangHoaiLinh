package _07_abstract_class_va_interface.bai_tap.InterfaceColorable;

import _06_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc.Square;

public class SquareColorable extends Square implements Colorable {

    public SquareColorable(double side, String color, boolean filled) {
        super(side, color, filled);
    }
    public SquareColorable(){}
    @Override
    public String howToColor() {
        return "Color all four sides..";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
