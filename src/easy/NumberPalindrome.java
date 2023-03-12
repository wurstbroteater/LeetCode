package easy;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-11));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        String in = Integer.toString(x);
        if (in.startsWith("-")) {
            return false;
        }
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) != in.charAt(in.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
