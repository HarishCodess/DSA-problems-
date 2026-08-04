class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int lp=0;
        
        
        for(int rp=1;rp<nums.length;rp++){
            if(nums[lp]!=nums[rp]){
                lp++;
                nums[lp]= nums[rp];
            }
            
        }
        return lp+1;
    }
}