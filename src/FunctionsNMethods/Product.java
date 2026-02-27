package FunctionsNMethods;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=Product(a,b);
        System.out.println(ans);

    }
    static int Product(int x,int y){
        int ans=x*y;
        return ans;
    }
}
