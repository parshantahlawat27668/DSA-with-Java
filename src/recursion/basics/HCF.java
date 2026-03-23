package recursion.basics;

public class HCF {
    static int Level1(int n, int m){
        int hcf = 1;
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        if(max%min == 0) return min;
        for (int i = min/2; i>1; i--){
            if(min%i==0 && max%i==0) return i;
        }
        return hcf;
    }
    static int Level2(int n, int m){
        int hcf = 1;
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
    static int withRecursion(int a,int  b){
        if(a==0) return b;
        return withRecursion(b%a, a);
    }
    static void main(String[] args) {
        System.out.println(withRecursion(6,12));
    }
}
