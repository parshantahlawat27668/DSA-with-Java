package recursion.problems;

public class LookAndSayPattern {
    static String level1(int n){
        if(n==1) return "1";
        String s  = level1(n-1);
        int i = 0, j = 0;
        String ans  = "";
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else {
                ans = ans + (j-i) + s.charAt(i);
                i = j;
            }
        }
        ans = ans + (j-i) + s.charAt(i);
        return ans;

    }
    static void main(String[] args) {
        System.out.println(level1(5));
    }
}
