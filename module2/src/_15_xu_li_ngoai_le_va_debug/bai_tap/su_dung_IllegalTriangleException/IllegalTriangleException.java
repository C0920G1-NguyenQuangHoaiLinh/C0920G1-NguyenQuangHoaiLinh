package _15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String msg) {
        super(msg);
    }

    public IllegalTriangleException() {
        super("Day khong phai la tam giac");
    }
}
