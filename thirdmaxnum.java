import java.util.*;
class thirdmaxnum {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int uniquecount=1   ;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                uniquecount++;
                if(uniquecount==3){
                    return nums[i-1];
                }
            }
        }
        return nums[nums.length-1];
    }
}