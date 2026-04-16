package recursion.problems;

public class ReverseNumber {
    static int basic(int num, int rev){
        if(num == 0) return rev;
        return basic(num/10, rev * 10 + num%10);
    }
    static void main(String[] args) {
        System.out.println(basic(43644, 0));
    }
}
