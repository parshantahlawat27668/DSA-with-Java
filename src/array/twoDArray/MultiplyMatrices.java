package array.twoDArray;

public class MultiplyMatrices {
    static void print(int[][] arr){
        for(int[] row : arr){
            for(int value: row){
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void basicApproach(int[][] a, int[][] b){
        int[][] arr = new int[a.length][a[0].length];
        print(arr);
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                int cal = 0;
                for(int k = 0; k<a[0].length; k++){
                    cal += a[i][k] * b[k][j];
                }
                arr[i][j] = cal;
            }
        }
        print(arr);
    }
    static void main(String[] args) {
        int[][] a = {
                {3,6,3},
                {8,5,3},
                {6,3,6}
        };
        int[][] b = {
                {5,4,6},
                {9,4,7},
                {2,6,3}
        };

        basicApproach(a, b);



    }
}
