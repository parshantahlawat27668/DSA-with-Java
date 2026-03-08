package array.problems;

public class SearchAnElementInSortedAndRotatedArray {
    static int basicApproach(int[] arr, int k){
        int  left = 0, right = arr.length-1, findex = -1, mid;
        while(left<=right){
             mid = left + (right -  left)/2;
            if(arr[mid] == k) return mid ;
//            if(arr[mid] > arr[mid + 1]){
            if(mid < arr.length - 1 && arr[mid] > arr[mid + 1]){
                findex = mid;
                break;
            }

//            if(arr[0]<arr[mid]){
            if(arr[left]<= arr[mid]){
                left = mid + 1;
            }
            else right = mid -1;
        }

            left = 0;
            right = findex;
            while (left <= right) {

                mid = left + (right - left) / 2;
                if (arr[mid] == k) return mid;
                else if (k < arr[mid]) right = mid - 1;
                else left = mid + 1;
            }
//        }

//        if(findex + 1 != arr.length -1) {
            left = findex + 1;
            right = arr.length - 1;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (arr[mid] == k) return mid;
                else if (k < arr[mid]) right = mid - 1;
                else left = mid + 1;
            }
        return -1;
    }
    static void main() {
        int[] arr = {265, 670, 863, 950, 958, 892};
        System.out.println(basicApproach(arr, 5));
    }
}

// log n + log n + log n
// Complexity is O(log n)

// Algorithm
