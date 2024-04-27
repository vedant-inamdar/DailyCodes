class concatenationofarr {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int result[]=new int[2*n];
        for(int i=0;i<n;i++){
            result[i]=nums[i];
            result[i+n]=nums[i];
        }
        return result;
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        concatenationofarr sol=new concatenationofarr();
        int nums[]={1,2,3};
        int result[]=sol.getConcatenation(nums);
        print(result);
    }
}