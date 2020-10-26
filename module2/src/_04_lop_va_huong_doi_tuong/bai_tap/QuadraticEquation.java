package _04_lop_va_huong_doi_tuong.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        double delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double getRoot1(){
        return (-b + Math.pow(getDiscriminant(),0.5))/(2 * a);
    }
    public double getRoot2(){
        return (-b - Math.pow(getDiscriminant(),0.5))/(2 * a);
    }
    public double getRoot3(){
        return -b/ 2 * a;
    }
    public String getRoot4(){
        return "The equation has no roots";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation result = new QuadraticEquation(a, b, c);
        if (result.getDiscriminant() > 0){
            System.out.println(result.getRoot1() + " and " + result.getRoot2());
        } else if (result.getDiscriminant() == 0){
            System.out.println(result.getRoot1());
        }else {
            System.out.println(result.getRoot4());
        }
    }
}
