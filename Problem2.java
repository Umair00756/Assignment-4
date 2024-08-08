public class Problem2 {
    public static void main(String[] args) {

        String s = "ABBA";
        int result = checkPalindrome(s , s.length());
        if (result==1){
            System.out.println("It is palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

    }
    public static int checkPalindrome (String s , int lenght){
        if (lenght <= 1){
            return 1;
        }
        if (s.charAt(0) == s.charAt(lenght-1)){
            return checkPalindrome(s.substring(1, lenght - 1), lenght -2);
        } else {
            return 0;
        }

    }
}
