// class Solution {
//     public boolean isMonotonic(int[] nums) {
//        int[] ans = new int[nums.length];
//        for(int i = 0;i<nums.length;i++){
//         ans[i] = nums[i];
//        }
//        Arrays.sort(ans);
//        if(Arrays.equals(ans,nums)){
//         return true;
//        }
//        return false; 
//     }
// }
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 0;i< nums.length - 1;i++){
            if(nums[i] > nums[i+1]){
                increasing = false;
            }
            if(nums[i] < nums[i+1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}