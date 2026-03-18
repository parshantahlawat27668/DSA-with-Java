package array.twoDArray;

public class TransposeMatrix {
    static void basicApproach(int[][] arr){
        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void print(int[][] arr){
        for(int[] row : arr){
            for(int value: row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        int[][] arr = {{5,8,4,2}, {5,8,0,9}, {0,7,3,6}, {8,4,2,7}};
        print(arr);
        basicApproach(arr);
        System.out.println();
        print(arr);
    }
}

