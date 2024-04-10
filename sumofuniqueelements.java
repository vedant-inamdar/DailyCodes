import java.util.*;
public class sumofuniqueelements {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                duplicates.add(num);
            } else {
                set.add(num);
            }
        }
        set.removeAll(duplicates);

        int sum = 0;
        for (int num : set) {
            sum = sum + num;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,2};
        sumofuniqueelements soln = new sumofuniqueelements();
        int result=soln.sumOfUnique(nums);
        System.out.println(result);
    }
}