package strings;

public class StringBasics {
    static void main(String[] args) {
        String s = "String";

        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                System.out.println(s.substring(i, j+1));
            }
        }

    }
}


// string.charAt();
// string.length();
// string.indexOf();
// string.lastIndexOf();
// string.toLowerCase();
// string.toUpperCase();
// string.startsWith();
// string.endsWith();
// string.contains();
// stringA.compareTo(stringB); it  compares lexographically like a dictionary;
// stringA.concat(stringB);
// Integer.toString(string);
// Integer.parseInt(string);
// string.toCharArray(string);
// string.substring(n, m);  print rest of the string after given n index. m is optional but if is there it indicates end;
// stringA.equals(stringB);
