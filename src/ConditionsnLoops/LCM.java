package ConditionsnLoops;
import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int x=a;
        int y=b;
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int HCF=a;
        int LCM=(x*y)/HCF;
        System.out.println(LCM);
    }
}
