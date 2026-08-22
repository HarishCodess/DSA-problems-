class Solution {
    public boolean checkDivisibility(int n) {
        int orignl=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            prod=prod*digit;
            n/=10;
        }
        if(orignl%(sum+prod)==0){
            return  true;
        }
        return false;
    }
}