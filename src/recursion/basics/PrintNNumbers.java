package recursion.basics;

public class PrintNNumbers {
    static void recursionPrint(int n){
        if(n == 0) return;
//        System.out.println(n);
        recursionPrint(n - 1);
        System.out.println(n);

    }
    static void main(String[] args) {
        recursionPrint(5);
    }
}
