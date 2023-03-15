package easy;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        int lastLength = 0;
        for (Character c : s.trim().toCharArray()) {
            if (c != ' ') {
                lastLength++;
            } else {
                lastLength = 0;
            }
        }
        return lastLength;
    }

    public static void main(String[] args) {
        LengthLastWord llw = new LengthLastWord();
        System.out.println(llw.lengthOfLastWord("Hello World"));
        System.out.println(llw.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(llw.lengthOfLastWord("luffy is still joyboy"));
    }
}
