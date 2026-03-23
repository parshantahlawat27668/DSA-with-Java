package recursion.basics;

public class Fibonacci {
    static int level1(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return level1(n-1) + level1(n-2);
    }
    static void main(String[] args) {

    }
}
