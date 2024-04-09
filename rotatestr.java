public class rotatestr {
    public boolean rotateString(String s, String goal) {
        // If lengths of s and goal are different, they cannot be rotations of each other
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Concatenate s with itself to handle rotation
        String rotated = s + s;
        
        // Check if goal is a substring of the concatenated string
        return rotated.contains(goal);
    }
}