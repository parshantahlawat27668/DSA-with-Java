package recursion.problems;

public class TowerOfHanoi {
    static void level1(int disc, char from, char use, char to){
        if(disc == 0) return;
        level1(disc-1,from, to, use );
        System.out.println(from + " -> " + to);
        level1(disc-1, use, from, to);
    }
    static void main(String[] args) {
        level1(3,'A', 'B', 'C');
    }

}
