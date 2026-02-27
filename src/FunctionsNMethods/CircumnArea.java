package FunctionsNMethods;
import java.util.*;


public class CircumnArea {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        double radius=in.nextDouble();
        double[] ans=CA(radius);
        System.out.println(Arrays.toString(ans));

    }
    static double[] CA(double r){
        double c=2*3.14*r;
        double a=3.14*r*r;
        return new double[] {c,a};
    }
}
