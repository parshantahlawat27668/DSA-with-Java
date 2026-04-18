package array.problems;

public class MergeTwoSortedArray {
    static int[] basic(int[] a, int[] b){
        int[] arr = new int[a.length + b.length];
        int aPtr = 0;
        int bPtr = 0;
        for(int i = 0; i< arr.length; i++){
            if(aPtr < a.length && a[aPtr] < b[bPtr]){
                arr[i] = a[aPtr];
                aPtr++;
            }
            else{
                arr[i] = b[bPtr];
                bPtr++;
            }
        }
        return  arr;
    }
    static void print(int[] arr){
        for(int elem: arr) System.out.print(elem + " ");
        System.out.println();
    }
    static void main(String[] args) {
        int[] a = {2,5,7,9};
        int[] b = {4,6,8,9,13,17};
        print(a);
        print(b);
        print(basic(a,b));

    }
}
