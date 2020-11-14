package _13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Enter a string : " + input);
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < input.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i+1;j < input.length();j++){
                if (input.charAt(j) > list.getLast()){
                    list.add(input.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character index: max) {
            System.out.print(index);
        }
    }
}
