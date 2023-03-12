package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    final static Map<Character, Integer> romanToIntMappings = new HashMap<>(
            Map.of('I', 1,
                    'V', 5,
                    'X', 10,
                    'L', 50,
                    'C', 100,
                    'D', 500,
                    'M', 1000));

    public static void main(String[] args) {
        System.out.println(romanToInt("IX")); //9
        System.out.println(romanToInt("LV")); //55
        System.out.println(romanToInt("MCMXCIV")); //1994
    }

    public static int romanToInt(String s) {
        int out = 0;
        for (int i = 0; i < s.length(); i++) {
            final int current = romanToIntMappings.get(Character.toUpperCase(s.charAt(i)));
            final int next = i + 1 == s.length() ? 0 : romanToIntMappings.get(Character.toUpperCase(s.charAt(i + 1)));
            if (current < next) {
                out -= current;
            } else {
                out += current;
            }
        }
        return out;
    }
}
