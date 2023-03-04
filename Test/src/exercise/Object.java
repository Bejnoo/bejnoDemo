package exercise;

import java.util.Arrays;

public class Object {


    public static boolean compare(String word1, String word2){
        char[] first =word1.toCharArray();
        char[] second =word2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}
