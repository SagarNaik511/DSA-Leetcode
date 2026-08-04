class Solution {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
       while(n != 0){
        int lastNum = n%10;
        mul = mul * lastNum;
        sum = sum + lastNum;
        n = n / 10;
       }
       int ans = mul - sum;
       return ans;  
    }
}