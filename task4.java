public class task4 {

    public static boolean isPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }

}