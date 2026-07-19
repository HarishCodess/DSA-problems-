class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        // 1. Find the min and max elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        // 2. Continuous Euclidean algorithm to find GCD
        while (min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }
        
        // When min becomes 0, max holds the GCD
        return max;
    }
}