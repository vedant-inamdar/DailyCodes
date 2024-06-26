public class palindromenum {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return num == reversed;
    }

    public static void main(String[] args) {
        palindromenum sol=new palindromenum();
        int x=121;
        boolean result=sol.isPalindrome(x);
        System.out.println(result);
    }
}