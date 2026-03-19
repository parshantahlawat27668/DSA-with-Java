package array.twoDArray;

public class SpirallyTraversingAMatrix {
    static void basicApproach(int[][] arr){
        int firstRow, lastRow, firstCol, lastCol;
        firstRow = 0;
        lastRow = arr.length-1;
        firstCol = 0;
        lastCol = arr[0].length-1;
        while(firstRow <= lastRow && firstCol <= lastCol) {
            for (int i = firstCol; i <= lastCol; i++) {
                System.out.print(arr[firstRow][i] + " ");
            }
            firstRow++;

            for (int i = firstRow; i <= lastRow; i++) {
                System.out.print(arr[i][lastCol] + " ");
            }
            lastCol--;

            if(firstRow<=lastRow){
            for (int i = lastCol; i >= firstCol; i--) {
                System.out.print(arr[lastRow][i] + " ");
            }
            lastRow--;
            }

            if(firstCol<=lastCol){
            for(int i = lastRow; i >= firstRow; i--){
                System.out.print(arr[i][firstCol] + " ");
            }
            firstCol++;
            }
        }
    }
    static void print(int[][] arr){
        for(int[] row: arr){
            for(int value: row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[][] arr = {
                {5,8,3,5,7},
                {7,4,5,7,4},
                {9,3,8,3,5},
                {7,2,8,3,8},
                {2,7,3,5,7}
        };
        print(arr);
        basicApproach(arr);
    }
}
