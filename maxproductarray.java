class maxproductarray {
    public int maxProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > m1) {
                m2 = m1;
                m1 = num;
            } else if (num > m2) {
                m2 = num;
            }
        }
        return (m1 - 1) * (m2 - 1);
    }
}