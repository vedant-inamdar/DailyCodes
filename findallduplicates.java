class findallduplicates {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>duplicates=new ArrayList<>();
        for(int num:nums){
            if(set.contains(num)){
                duplicates.add(num);
            }else{
                set.add(num);
            }
        }
        return duplicates;
    }
}