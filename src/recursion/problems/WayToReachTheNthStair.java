package recursion.problems;

public class WayToReachTheNthStair {
    static int level1(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return level1(n-1) + level1(n-2);
    }
    static void main(String[] args) {

    }
}
