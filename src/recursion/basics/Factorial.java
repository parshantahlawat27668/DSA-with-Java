package recursion.basics;

public class Factorial {
    static int basic(int n){
        if(n==0 || n==1 ) return 1;
        int ans = n * basic(n-1);
        return  ans;
    }
    static void main(String[] args) {
        System.out.println(basic(12));
    }
}
