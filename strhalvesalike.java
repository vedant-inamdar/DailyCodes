class strhalvesalike {
    String vowels = "aeiouAEIOU";

    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int ans = 0;
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) {
                ans++;
            }
            if (vowels.indexOf(s.charAt(j)) >= 0) {
                ans--;
            }
        }
        return ans == 0;
    }

    public static void main(String[] args) {
        strhalvesalike sol=new strhalvesalike();
        String s="book";
        boolean result=sol.halvesAreAlike(s);
        System.out.println(result);
    }
}