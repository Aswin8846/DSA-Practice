package DSAPractice;

import java.util.Arrays;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return i > 0 ? first.substring(0, i) : "-1";
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"}));
        System.out.println(longestCommonPrefix(new String[]{"hello", "world"}));
    }
}


