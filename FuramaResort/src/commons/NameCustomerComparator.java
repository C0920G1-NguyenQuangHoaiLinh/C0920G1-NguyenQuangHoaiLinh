package commons;

import javafx.scene.input.DataFormat;
import models.Customer;

import java.util.Comparator;
import java.util.Date;

public class NameCustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getHoTen().compareTo(o2.getHoTen())==0){
            Date brith1 = new Date(o1.getNgaySinh());
            Date brith2 = new Date(o2.getNgaySinh());
            Date nowDay = new Date();

            long age1 = nowDay.getTime()-brith1.getTime();
            long age2 = nowDay.getTime()-brith2.getTime();

            if (age1 > age2){
                return 1;
            }else if (age1 < age2){
                return -1;
            }else {
                return 0;
            }
        }
        return o1.getHoTen().compareTo(o2.getHoTen());
    }

}
