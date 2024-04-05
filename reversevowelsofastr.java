class reversevowelsofastr {
    public String reverseVowels(String s) {
        if(s==null || s.length()<=1){
            return s;
        }

        char[] chars=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(isVowel(chars[left]) && isVowel(chars[right])){
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            else if(!isVowel(chars[left])){
                left++;
            }
            else{
                right--;
            }
        }
        return new String(chars);
    }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}