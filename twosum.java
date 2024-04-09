class twosum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        twosum sol=new twosum();
        int[] nums={1,2,3,4,5};
        int target=9;
        int[] result=sol.twoSum(nums, target);
        if(result!=null){
            System.out.println(result[0]+" "+result[1]);
        }else{
            System.out.println("No");
        }
    }
}