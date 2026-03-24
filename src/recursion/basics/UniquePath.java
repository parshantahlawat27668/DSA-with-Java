package recursion.basics;

public class UniquePath {
    static int level1(int m, int n){
        if (m == 1 || n == 1) return 1;
        return level1(m+1, n) + level1(m, n+1);
    }
    static void main(String[] args) {

    }
}
