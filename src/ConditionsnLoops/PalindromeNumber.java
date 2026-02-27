package ConditionsnLoops;
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int original=num;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        System.out.println(rev);
        if(original==rev){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

    }
}
