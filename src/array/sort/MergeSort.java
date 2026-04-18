package array.sort;

public class MergeSort {
    static void basic(int[] arr){
        if(arr.length == 1) return;

        int[] a = new int[arr.length/2];
        int[] b = new int[arr.length - (arr.length/2)];
        int pointer = 0;

        for(int i = 0; i<a.length; i++){
            a[i] = arr[pointer];
            pointer++;
        }

        for(int i = 0; i<b.length; i++){
            b[i] = arr[pointer];
            pointer++;
        }

        basic(a);
        basic(b);

        merge(a, b, arr);
    }

    static void merge(int[] a, int[] b, int[] arr){
        int aPtr = 0;
        int bPtr = 0;
        int arrPtr = 0;

        while(aPtr<a.length && bPtr<b.length){
            if(a[aPtr]<b[bPtr]){
                arr[arrPtr] = a[aPtr];
                arrPtr++;
                aPtr++;
            }
            else{
                arr[arrPtr] = b[bPtr];
                arrPtr++;
                bPtr++;
            }
        }

        while(aPtr<a.length){
            arr[arrPtr] = a[aPtr];
            arrPtr++;
            aPtr++;
        }

        while(bPtr < b.length){
            arr[arrPtr] = b[bPtr];
            arrPtr++;
            bPtr++;
        }
    }

        static void print(int[] arr){
            for(int elem:arr) System.out.print(elem + " ");
            System.out.println();
        }
    static void main(String[] args) {
        int[] arr = {4,7,4,5,7,98,6,433,6,75,32,54,7,5,44,6,54,7};
        print(arr);
        basic(arr);
        print(arr);

    }
}
