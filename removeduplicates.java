public class removeduplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n <= 1) {
            return n;
        }

        int unique = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[unique] = nums[i];
                unique++;
            }
        }

        return unique;
    }
}