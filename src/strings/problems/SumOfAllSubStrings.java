package strings.problems;

public class SumOfAllSubStrings {
    static int basicApproach(String s){
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                sum = sum +  Integer.parseInt(s.substring(i, j+1));
            }
        }
        return sum;
    }

    static void main(String[] args) {
        String s = "421";
        System.out.println(basicApproach(s));
    }
}
