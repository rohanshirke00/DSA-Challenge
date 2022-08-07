class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        
        if(n==0||n==1){
            return 0;
        }
        while(n>0){
            int rem = n%10;
            product *= rem;
            sum += rem;
            n /= 10;
        }
        return product-sum;
    }
}