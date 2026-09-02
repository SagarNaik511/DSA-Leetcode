// class Solution {
//     public int rob(int[] nums) {
//         int sum = 0;
//         int sum2 = 0;
//         int max = 0;
//       for(int i = 0;i<nums.length;i=i+2){
//         sum = sum + nums[i];
//       }
//       for(int i = 1;i<nums.length;i=i+2){
//         sum2 = sum2 + nums[i];
//       }
//       max = Math.max(sum,sum2);
//     return max;
//     }
// }

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for(int i=2;i<nums.length;i++){
           dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]); 
        }
        return dp[nums.length - 1];
    }
}