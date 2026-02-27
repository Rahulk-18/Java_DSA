package FunctionsNMethods;
import java.util.*;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        String a=EvenOdd(n);
        System.out.println(a);

    }
    static String EvenOdd(int n){
        if(n%2==0){
            return "even";
        }
        return "odd";

    }
}
