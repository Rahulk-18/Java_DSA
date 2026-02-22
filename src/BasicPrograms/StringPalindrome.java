package BasicPrograms;
import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str=in.next();
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
