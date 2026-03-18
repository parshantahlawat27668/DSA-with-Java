package array.twoDArray;

public class RotateBy90Degree {
    static void print(int[][] arr){
        for(int[] row: arr){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void basicApproach(int[][] arr){
        for(int i = 1; i< arr.length; i++){
            for(int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i<arr.length; i++){
            int left = 0, right = arr[0].length-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    static void main(String[] args) {
        int[][] arr = {{4,7,3}, {8,6,3}, {1,5,3}};
        print(arr);
        basicApproach(arr);
        print(arr);
    }
}
