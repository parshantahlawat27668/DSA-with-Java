package array.twoDArray;

public class twoDArray {
    static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
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
    }
}
