class Solution {
    public int maxArea(int[] height) {
        int waterstored=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int height1=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int area=height1*width;
            waterstored=Math.max(waterstored,area);
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return waterstored;
    }
}