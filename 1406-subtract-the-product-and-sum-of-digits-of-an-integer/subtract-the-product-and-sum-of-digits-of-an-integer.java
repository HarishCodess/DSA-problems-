class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0 , pro=1;

        while(n>0){
             int x=n%10;
             n=n/10;
            sum+=x;
            pro*=x;
        }
        return (pro-sum);
       

    }
}