package ConditionsnLoops;
import java.util.*;

public class Distancebw2points {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1st point:");
        double n1=in.nextDouble();
        System.out.println("Enter 2st point:");
        double n2=in.nextDouble();
        double dist=n2-n1;
        System.out.println("Total Distance:"+dist);
    }
}
