package strings.problems;

public class CountNumberOfVowels {
    static int basicApproach(String str){
        int counter = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') counter ++;
        }
        return counter;
    }
    static void main(String[] args) {
        String s = "Find the vowels in this string";
        System.out.println(basicApproach(s));
    }
}
