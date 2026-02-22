package BasicPrograms;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=in.nextInt();
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
