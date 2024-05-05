class detectcapital {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                cap++;
            }
        }
        if (cap == 0 || cap == word.length() || cap == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        } else {
            return false;
        }
    }
}