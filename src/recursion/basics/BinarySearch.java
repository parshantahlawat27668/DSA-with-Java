package recursion.basics;

public class BinarySearch {
    static int helper(int[] arr, int target, int left, int right){
        if(left > right ) return -1;
        int mid = left + (right-left)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid]>target) return helper(arr, target, left, mid-1);
        else return helper(arr, target, mid+1, right);
    }
    static int level1(int[] arr, int target){
        return helper(arr, target, 0, arr.length-1);
    }
    static void main(String[] args) {
        int[] arr = {0, 3, 5, 6, 7, 8};
        System.out.println(level1(arr, 8));
    }
}
