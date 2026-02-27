package FunctionsNMethods;
import java.util.*;

public class MaxnMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max=Max(a,b,c);
        System.out.println("Max:"+max);
        int min=Min(a,b,c);
        System.out.println("Min:"+min);

    }
    static int Max(int a,int b,int c){
        int ans=Math.max(a,Math.max(b,c));
        return ans;
    }
    static int Min(int a,int b,int c){
        int ans=Math.min(a,Math.min(b,c));
        return ans;
    }
}
