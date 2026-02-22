package BasicPrograms;
import java.util.*;
public class Fibinocci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = in.nextInt();

        int a = 0, b = 1;

        if(n >= 1) System.out.print(a + " ");
        if(n >= 2) System.out.print(b + " ");

        for(int i = 3; i <= n; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}