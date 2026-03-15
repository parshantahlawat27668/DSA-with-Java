package array.twoDArray;

public class SnakePrint {
    static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                for(int j = 0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]);
                }
            }
            else {
                for(int j = arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        int[][] arr= {{3,4,6}, {5,7,3}, {4,9,3}};
        print(arr);
    }
}
