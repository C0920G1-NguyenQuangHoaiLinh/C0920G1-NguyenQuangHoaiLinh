package _02_vong_lap_trong_java.bai_tap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        for (int i = 2; i < 100; i++) {
            int temp = 0;
            for (int j = 2; j <= Math.sqrt(N); j++) {
                if (N % j == 0) {
                    temp++;
                }
            }
            if (temp == 0) {
                System.out.println(N);
            }
            N++;
        }
    }
}
