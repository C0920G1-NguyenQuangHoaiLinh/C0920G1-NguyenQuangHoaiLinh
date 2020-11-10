package _11_dsa_stack_and_queue.bai_tap.dem_so_lan_xuat_hien_moi_tu_trong_mang;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class CountChartInMap {
    public static void main(String[] args) {
        int size = 5;
        String[] strings = new String[size];
        for (int i = 0;i < size;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("input string :");
            strings[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(strings));

        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < size;i++){
            if (map.containsKey(strings[i])){
                map.put(strings[i], map.get(strings[i])+ 1);
            } else {
                map.put(strings[i], 1);
            }
        }
        System.out.println(map);
    }
}
