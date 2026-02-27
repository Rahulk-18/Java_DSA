package ConditionsnLoops;

import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.nextLine();

        char[] arr = w.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        String reversed = new String(arr);
        System.out.println(reversed);
    }
}