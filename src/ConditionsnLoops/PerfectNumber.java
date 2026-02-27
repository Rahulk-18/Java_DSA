package ConditionsnLoops;
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i <= n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not perfect");
        }
    }
}
