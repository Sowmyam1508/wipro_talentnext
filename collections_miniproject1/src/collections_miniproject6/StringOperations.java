package collections_miniproject6;
import java.util.*;

public class StringOperations {

    public static ArrayList<String> performOperations(String S1, String S2) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < S1.length(); i++) {
            if (i % 2 == 0) {
                sb1.append(S2);
            } else {
                sb1.append(S1.charAt(i));
            }
        }
        result.add(sb1.toString());
        int first = S1.indexOf(S2);
        int last = S1.lastIndexOf(S2);
        if (first != -1 && last != -1 && first != last) {
            StringBuilder sb2 = new StringBuilder(S1);
            String reversedS2 = new StringBuilder(S2).reverse().toString();
            sb2.replace(last, last + S2.length(), reversedS2);
            result.add(sb2.toString());
        } else {
            result.add(S1 + S2);
        }
        if (first != -1 && last != -1 && first != last) {
            StringBuilder sb3 = new StringBuilder(S1);
            sb3.delete(first, first + S2.length());
            result.add(sb3.toString());
        } else {
            result.add(S1);
        }
        int half = S2.length() / 2;
        String startPart = S2.substring(0, (S2.length() % 2 == 0) ? half : half + 1);
        String endPart = S2.substring((S2.length() % 2 == 0) ? half : half + 1);
        String combined = startPart + S1 + endPart;
        result.add(combined);
        Set<Character> s2Chars = new HashSet<>();
        for (char ch : S2.toCharArray()) {
            s2Chars.add(ch);
        }

        StringBuilder sb5 = new StringBuilder();
        for (char ch : S1.toCharArray()) {
            if (s2Chars.contains(ch)) {
                sb5.append('*');
            } else {
                sb5.append(ch);
            }
        }
        result.add(sb5.toString());

        return result;
    }
    public static void main(String[] args) {
        String S1 = "JAVAJAVA";
        String S2 = "VA";

        ArrayList<String> output = performOperations(S1, S2);
        System.out.println("Output: " + output);
    }
}