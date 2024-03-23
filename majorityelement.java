public class majorityelement {
    public int majorityElement(int[] nums) {
        int majornum = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                majornum = num;
            }

            if (num == majornum) {
                count++;
            } else {
                count--;
            }
        }

        return majornum;
    }
}