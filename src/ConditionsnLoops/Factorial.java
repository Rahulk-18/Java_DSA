package ConditionsnLoops;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("Invalid");
            return;
        }
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact =fact*i;
        }
        System.out.println(fact);
    }
}