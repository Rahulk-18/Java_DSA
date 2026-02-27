package FunctionsNMethods;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=Sum(a,b);
        System.out.println(ans);

    }
    static int Sum(int x,int y){
        int ans=x+y;
        return ans;
    }
}
