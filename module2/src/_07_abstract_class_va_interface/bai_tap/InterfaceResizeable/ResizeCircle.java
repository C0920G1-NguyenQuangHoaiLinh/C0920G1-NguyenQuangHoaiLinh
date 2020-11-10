package _07_abstract_class_va_interface.bai_tap.InterfaceResizeable;

import _06_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc.Circle;

public class ResizeCircle extends Circle implements Resizeable{
    public ResizeCircle(){
    }

    public ResizeCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*percent + 1);
    }
}
