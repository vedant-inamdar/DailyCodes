public class appendcharstostr {
    public int appendCharacters(String s, String t) {
        int sidx = 0;
        int tidx = 0;
        while (sidx < s.length() && tidx < t.length()) {
            if (s.charAt(sidx) == t.charAt(tidx)) {
                tidx++;
            }
            sidx++;
        }
        return t.length() - tidx;
    }
}