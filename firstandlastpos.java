class firstandlastpos {
    public int[] searchRange(int[] nums, int target) {
        int firstpos = -1;
        int lastpos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (firstpos == -1) {
                    firstpos = i;
                }
                lastpos = i;
            }
        }
        int[] result = { firstpos, lastpos };
        return result;
    }
}