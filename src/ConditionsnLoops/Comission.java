package ConditionsnLoops;

import java.util.*;

public class Comission {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter Amount:");
    double Oprice=in.nextDouble();
    System.out.println("Enter Comission:");
    double dis=in.nextDouble();
    double price=Oprice+((dis/100)*Oprice);
    System.out.println("Total:"+price);
}
}
