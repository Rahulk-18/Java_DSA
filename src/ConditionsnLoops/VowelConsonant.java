package ConditionsnLoops;
import java.util.*;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String ch=in.next();
        if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
