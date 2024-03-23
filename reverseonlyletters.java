public class reverseonlyletters {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        char arr[] = s.toCharArray();
        // for(int i=0;i<arr.length;i++){
        // char left=s.toChar[left];
        // char right=s.toChar[right];
        while (left < right) {
            if (Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                // }
            } else if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
