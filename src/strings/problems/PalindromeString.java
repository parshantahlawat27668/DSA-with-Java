package strings.problems;

public class PalindromeString {
    static boolean basicApproach(String str){
        int left = 0, right = str.length()-1;
        while(left<=right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
    static void main(String[] args) {
        String str = "nitin";
        System.out.println(basicApproach(str));
    }
}
