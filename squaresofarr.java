import java.util.Arrays;

public class squaresofarr {
        public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        // int result[]=new int[n]; if we want to create new array to store result
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}