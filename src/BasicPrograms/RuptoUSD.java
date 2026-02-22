package BasicPrograms;
import java.util.*;

public class RuptoUSD {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rupees:");
        int r=in.nextInt();
        double usd=r*0.011;
        System.out.println("USD: "+usd);
    }
}
