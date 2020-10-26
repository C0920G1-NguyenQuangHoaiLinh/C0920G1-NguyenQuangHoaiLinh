package _02_vong_lap_trong_java.bai_tap;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int numbers = 20;
        int N = 2;
        int count = 0;
        while (count < numbers){
            int temp = 0;
            for (int i = 1; i < Math.sqrt(N);i++){
                if (N % i == 0){
                    temp++;
                }
            }
            if (temp == 1){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
