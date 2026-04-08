package recursion.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static void helper(int n, int l, int r, String s,List<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) helper(n, l + 1, r, s + "(", ans);
        if(r<l) helper(n, l, r + 1, s + ")", ans);
    }
    static List<String> level1(int n){
        List<String> ans = new ArrayList<>();
        helper(n, 0, 0, "", ans);
        return ans;
    }
    static void main(String[] args) {
        System.out.println(level1(5));
    }
}
