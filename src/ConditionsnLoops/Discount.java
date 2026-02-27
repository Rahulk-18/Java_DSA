package ConditionsnLoops;
import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Original Price:");
        double Oprice=in.nextDouble();
        System.out.println("Enter Discount:");
        double dis=in.nextDouble();
        double price=Oprice-((dis/100)*Oprice);
        System.out.println("Price will be:"+price);

    }
}
