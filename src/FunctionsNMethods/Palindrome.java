package FunctionsNMethods;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean a=Pal(n);
        System.out.println(a);

    }
    static boolean Pal(int n) {
        int original=n;
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse =reverse*10+digit;
            n /= 10;
        }
        return (original== reverse);

    }
}
