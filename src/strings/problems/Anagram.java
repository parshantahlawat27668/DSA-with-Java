package strings.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    static boolean basicApproach(String a, String b){
        if(a.length() != b.length()) return false;
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        for(int i =0; i<a.length();i++){
            if(arrA[i] != arrB[i]) return false;
        }
        return true;
    }
    static void main(String[] args) {
        String s1  = "this is string";
        String s2 = "is this string";
        System.out.println(basicApproach(s1, s2));
    }
}
