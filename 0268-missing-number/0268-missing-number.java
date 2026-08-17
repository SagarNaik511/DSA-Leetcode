class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int esum = n * (n + 1)/2; //Gauss's Formula
        
        int asum = 0;
        for(int num : nums){
            asum = asum + num;
        }
        return esum - asum;
    }
}