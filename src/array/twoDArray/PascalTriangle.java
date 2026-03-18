package array.twoDArray;

import java.util.ArrayList;

public class PascalTriangle {
    static void print(ArrayList<ArrayList<Integer>> arr){
        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();
    };

    static ArrayList<ArrayList<Integer>> basicApproach(int size){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i<size; i++){
            list.add(new ArrayList<>());
            for(int j = 0; j<i+1; j++){
                if(i == j || j == 0){
                    list.get(i).add(1);
                }
                else {
                    list.get(i).add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }

            }
        }
        return  list;
    }
    static void main(String[] args) {

        print(basicApproach(5));
    }
}
