public class firstpalinstr {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (ispalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean ispalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) == word.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}