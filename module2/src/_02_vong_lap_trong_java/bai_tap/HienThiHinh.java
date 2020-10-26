package _02_vong_lap_trong_java.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        num = sc.nextInt();
        String temp = "";
        switch (num){
            case 1:
                for (int i =0; i < 3; i++){
                    for (int j = 0;j<7;j++) {
                        temp += "*";
                    }
                    temp += "\n";
                }
                break;
            case 2:
                for (int i = 1;i <= 5;i++){
                    for (int j = 0; j < i;j++){
                        temp += "*";
                    }
                    temp += "\n";
                }
                break;
            case 3:
                for (int i =7; i >=1 ;i--){
                    for (int j =1; j <=i;j++){
                        temp += "*";
                    }
                    temp += "\n";
                }
            case 4:
                break;
        }
        System.out.println(temp);
    }
}
