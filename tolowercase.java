class tolowercase {
    public static String toLowerCase(String s) {
        // return s.toLowerCase();
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 'A' && result[i] <= 'Z') {
                result[i] = (char) (result[i] + 32);
            }
        }
        return new String(result);
    }
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(toLowerCase(s));
    }
}