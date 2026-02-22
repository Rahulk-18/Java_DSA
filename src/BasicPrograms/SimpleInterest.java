package BasicPrograms;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Principal amt:");
        int p=in.nextInt();
        System.out.println("Enter Time in yrs:");
        int t=in.nextInt();
        System.out.println("Enter Rate of interest");
        int r=in.nextInt();
        int si=(p*t*r)/100;
        System.out.println("SI: "+si);

    }
}
