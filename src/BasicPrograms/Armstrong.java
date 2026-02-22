package BasicPrograms;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int start = in.nextInt();
                int end = in.nextInt();
                for (int num = start; num <= end; num++) {

                    int original = num;
                    int temp = num;
                    int sum = 0;

                    // count digits
                    int n = (int)Math.log10(num) + 1;

                    // extract digits
                    while (temp > 0) {
                        int digit = temp % 10;
                        sum += Math.pow(digit, n);
                        temp /= 10;
                    }
                    if (sum == original) {
                        System.out.println(original);
                    }
                }
            }
        }



