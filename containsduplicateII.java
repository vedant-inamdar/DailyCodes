import java.util.*;
class containsduplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for (int i = 0; i < nums.length - 1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
        if (i > k) {
            set.remove(nums[i - k - 1]);
        }
        if (!set.add(nums[i])) {
            return true;
        }
    }
    
    return false;
    }
}