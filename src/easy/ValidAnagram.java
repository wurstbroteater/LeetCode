package easy;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isValidAnagram("danger", "nreadg"));
    }

    public boolean isValidAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return  false;
        }
        char[] str1AsArray = str1.toCharArray();
        Arrays.sort(str1AsArray);
        char[] stt2AsArray = str2.toCharArray();
        Arrays.sort(stt2AsArray);
        System.out.println(Arrays.toString(str1AsArray));
        System.out.println(Arrays.toString(stt2AsArray));
        return Arrays.equals(str1AsArray, stt2AsArray);
    }
 }
