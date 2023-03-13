package easy;

import java.util.Arrays;

public class LCP {
    public static void main(String[] args) {
        System.out.println("Prefix is: " + longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println("Prefix is: " + longestCommonPrefix(new String[]{"reflower", "flow", "flight"}));
        System.out.println("Prefix is: " + longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println("Prefix is: " + longestCommonPrefix(new String[]{"acc", "aaa", "aaba"}));
        System.out.println("Prefix is: " + longestCommonPrefix(new String[]{"c"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = "";
        boolean firstRound = true;
        for (int i = 0; i < strs.length; i++) {
            final String current = strs[i];
            final String next = i == strs.length - 1 ? prefix : strs[i + 1];
            final String tempPrefix = getPrefix(current, next);
            if (firstRound || tempPrefix.length() < prefix.length()) {
                prefix = tempPrefix;
                firstRound = false;
            }
            if (prefix.equals("")) {
                break;
            }
        }
        return prefix;
    }

    private static String getPrefix(String firstWord, String secondWord) {
        final StringBuilder builder = new StringBuilder();
        final int length = Math.min(firstWord.length(), secondWord.length());
        for (int i = 0; i < length; i++) {
            if (firstWord.charAt(i) == secondWord.charAt(i)) {
                builder.append(firstWord.charAt(i));
            } else {
                break;
            }
        }
        return builder.toString();
    }
}
