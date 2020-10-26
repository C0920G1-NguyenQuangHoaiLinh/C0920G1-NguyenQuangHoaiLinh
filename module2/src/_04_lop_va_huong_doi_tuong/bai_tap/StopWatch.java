package _04_lop_va_huong_doi_tuong.bai_tap;

import java.util.Scanner;

public class StopWatch {
    private long startTime , endTime;

    StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public StopWatch(long startTime, long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long start(){
        return this.startTime = System.currentTimeMillis();
    }

    public long stop(){
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch result = new StopWatch();
        result.start();
        int count = 0;
        for (int i = 0 ; i < Math.pow(9999,2); i++){
            count++;
        }
        result.stop();
        System.out.println(result.getElapsedTime());
    }
}
