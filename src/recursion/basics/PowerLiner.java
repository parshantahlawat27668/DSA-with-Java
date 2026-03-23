package recursion.basics;

public class PowerLiner {
    static int basic(int n, int m){
        if (m == 0) return 1;
        return n * basic(n, m-1);
    }
    static int optimized(int n, int m){
        if(m == 0) return 1;
        int cal = optimized(n, m/2);
        if(m%2 == 0) return cal*cal;
        else return cal * cal * n;
    }
    static void main(String[] args) {
        int num = 5;
        int power = 7;
        System.out.println(optimized(num, power));
    }
}
