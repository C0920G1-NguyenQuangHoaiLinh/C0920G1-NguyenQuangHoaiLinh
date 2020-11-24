package models;

import java.util.LinkedList;
import java.util.Queue;

public class Cinema4D {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Linh","1990","Nam","123","0122",
                "linh@mail.com","Vip","dn");
        Customer customer2 = new Customer("Hoai","2000","Nu","312","0999",
                "hoai@mail.vn","Diamond","qn");

        Queue<Customer> list = new LinkedList<>();
        list.add(customer1);
        list.add(customer2);
        for (Customer i : list){
            System.out.println(i);
        }
    }
}
