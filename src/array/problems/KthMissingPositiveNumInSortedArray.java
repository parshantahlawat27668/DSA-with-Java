package array.problems;

public class KthMissingPositiveNumInSortedArray {
    static int basicApproach(int[] arr, int kth){
        int left = 0, right = arr.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            int correct  = mid + 1;
            int missing = arr[mid] - correct;
            if(missing>=kth) right = mid -1;
            else left = mid + 1;
        }

        return left + kth;
    }
    static void main(String[] args) {
        int[] arr={3,5,6,7,8};
        int k = 5;

        System.out.println(basicApproach(arr, k));
    }
}
