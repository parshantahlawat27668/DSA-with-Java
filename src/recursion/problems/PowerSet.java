package recursion.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
    static void helper(String ans, String s, int index, List<String> list){
        if(index == s.length()){
            if(ans.length() != 0) list.add(ans);
            return;
        }
        char ch = s.charAt(index);
        helper(ans + ch, s, index + 1, list);
        helper(ans, s, index + 1, list);
    }
    static List<String> level1(String s){
        List<String> list = new ArrayList<>();
        helper("", s, 0, list);
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
    static void main(String[] args) {
        level1("abc");
    }
}
