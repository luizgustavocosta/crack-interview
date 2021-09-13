package leetcode;

public class IntegerPalindrome {
    public static void main(String[] args) {
        //121  - true
        //-121 - false
        //10   - false
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(60));
        System.out.println(isPalindrome(2002));
        System.out.println(isPalindrome(21312));
    }

    public static boolean isPalindrome(int number) {
        if (number == 0) return true;
        if (number < 0 || number % 10 == 0) return false;
        int reversed = 0;
        while (number > reversed) {
            int pop = number % 10;
            number /= 10;
            reversed = (reversed * 10) + pop;
        }
        if (number == reversed || number == reversed / 10) { //for odd numbers (impares)
            return true;
        }
        return false;
    }
}
