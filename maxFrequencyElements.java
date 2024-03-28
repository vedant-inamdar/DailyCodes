class Solution {
    public int maxFrequencyElements(int[] nums) {
        int totmaxelements = 0;
        int maxfreq = Integer.MIN_VALUE;
        int maxnum = Integer.MIN_VALUE;        
        for (int num : nums) {
            maxnum = Math.max(maxnum, num);
        }
        int[] count = new int[maxnum + 1];
        for (int num : nums) {
            count[num]++;
        }
        for (int num : count) {
            maxfreq = Math.max(maxfreq, num);
        }
        for (int num : nums) {
            if (maxfreq == count[num]) {
                totmaxelements++;
            }
        }
        
        return totmaxelements;
    }
}