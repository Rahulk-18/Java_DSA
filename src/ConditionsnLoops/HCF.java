package ConditionsnLoops;
import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println(a);
    }
}
