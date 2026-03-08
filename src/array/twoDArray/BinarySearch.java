package array.twoDArray;

public class BinarySearch {
    static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    static boolean basicApproach(int[][] arr, int target){
        int rows = arr.length, cols = arr[0].length, arrLength = rows*cols;
        int left = 0, right = rows * cols -1;
        while(left<=right){
            int mid = (left + right)/2;
            int midRow = mid/cols, midCol = mid%cols;
            if(arr[midRow][midCol] == target) return true;
            else if(arr[midRow][midCol] > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
    static void main(String[] args) {
        int[][] arr= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.println(arr[2][2]);
        System.out.println("Number of rows " + arr.length);
        System.out.println("Number of columns " + arr[0].length);
        System.out.println("Number of Elements " + arr.length * arr[0].length);
        print(arr);
        int target =5;
        System.out.println(basicApproach(arr,target));

    }
}
