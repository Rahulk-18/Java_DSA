package FunctionsNMethods;
import java.util.*;

public class Eligibility {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int age=in.nextInt();
        String a=Eligible(age);
        System.out.println(a);
    }
    static String Eligible(int n){
        if(n>18){
            return "eligible";
        }
        return "not eligible";
    }
}
