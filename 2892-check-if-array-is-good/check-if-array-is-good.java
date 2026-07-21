import java.util.Arrays;

class Solution {
    public boolean isGood(int[] nums) {
       
        if (nums.length < 2) {
            return false;
        }

        int n = nums.length - 1; 
        
       
        Arrays.sort(nums);
        
       
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }
        
       
        if (nums[n - 1] != n || nums[n] != n) {
            return false;
        }
        
        return true;
    }
}