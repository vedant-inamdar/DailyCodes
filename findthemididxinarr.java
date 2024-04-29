class findthemididxinarr {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        for (int mid = 0; mid < n; mid++) {
            int lsum = 0;
            int rsum = 0;            
            for (int i = 0; i < mid; i++) {
                lsum = lsum + nums[i];
            }
            for (int i = mid + 1; i < n; i++) {
                rsum = rsum + nums[i];
            }
            if (lsum == rsum) {
                return mid;
            }
        }
        return -1;
    }
}