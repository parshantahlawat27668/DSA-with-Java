package strings.problems;

import java.util.Arrays;

public class MostFrequentChar {
    static char basicApproach(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, j = 0, n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        while(j<n){
            if(arr[i] == arr[j]) j++;
            else {
                int freq = j-i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-1;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }
        return ans;
    }
    static void main(String[] args) {

    }
}
