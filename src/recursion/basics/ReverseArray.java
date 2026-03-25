package recursion.basics;

public class ReverseArray {
    static int[] helper(int[] arr, int left, int right){
        if(left >= right) return arr;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
        return helper(arr, left, right);
    };
    static int[] level1(int[] arr){
        helper(arr,0, arr.length-1);
        return  arr;
    }
    static void print(int[] arr){
        for(int elem:arr){
            System.out.print(elem + " " );
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {3,6,2,7,9,6,4};
        print(arr);
        level1(arr);
        print(arr);

    }
}
