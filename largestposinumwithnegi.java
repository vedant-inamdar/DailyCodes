class largestposinumwithnegi {
    public static int findMaxK(int[] nums) {
        int larpositive=-1;
        for(int num:nums){
            if(num>0){
                for(int negative:nums){
                    if(negative==-num){
                        larpositive=Math.max(larpositive,num);
                        break;
                    }
                }
            }
        }
        return larpositive;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 3};
        int result = findMaxK(nums);
        System.out.println("Output: " + result);
    }
}