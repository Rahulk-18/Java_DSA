package ConditionsnLoops;
import java.util.*;

public class PerfectNumberbwRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter end:");
        int end=in.nextInt();
        int sum=0;
        int start=1;
        for(start=1;start<end;start++) {
            sum=0;
            for (int i = 1; i <= start / 2; i++) {
                if (start % i == 0) {
                    sum += i;
                }
            }
            if(sum==start){
                System.out.println(start);
            }
        }

    }
}
