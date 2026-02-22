package BasicPrograms;
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=in.nextInt();
        System.out.println("Enter num2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        int diff=num1-num2;
        int product=num1*num2;
        double quot=0;
        if(num2==0){
            System.out.println("cannot divide by 0");
        }
        else {
             quot = (double)num1/num2;
        }
        System.out.println("Sum: "+sum +" Difference: "+diff +" Product: "+product+" Quotient: "+quot);
    }
}
