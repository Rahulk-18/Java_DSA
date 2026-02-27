package ConditionsnLoops;
import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number:");
        double num=in.nextDouble();
        System.out.println("Enter power");
        double power=in.nextDouble();
        double result=1;
        for(int i=1;i<=power;i++){
            result=result*num;

        }
        System.out.println(result);
    }
}
