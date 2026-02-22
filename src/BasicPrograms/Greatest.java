package BasicPrograms;
import java.util.*;
public class Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = in.nextInt();
        System.out.println("Enter num2:");
        int num2 = in.nextInt();
        int max=0;
        if(num1>num2){
            max=num1;
        }
        else{
            max=num2;
        }
        System.out.println("Max: "+max);
    }
}