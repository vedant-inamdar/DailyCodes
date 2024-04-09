import java.util.*;
class validanagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);
        return Arrays.equals(charArrayS, charArrayT);
    }

    public static void main(String[] args) {
        validanagram sol=new validanagram();
        String s="vedant";
        String t="tnadev";
        boolean result=sol.isAnagram(s, t);
        System.out.println(result);
    }
}