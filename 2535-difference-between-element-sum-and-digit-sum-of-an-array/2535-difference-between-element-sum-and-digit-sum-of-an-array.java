// class Solution {
//     public int differenceOfSum(int[] nums) {
//        int Esum = 0;
//        int sum = 0;
       
//        for(int i = 0;i<nums.length;i++){
//         sum = sum + nums[i];
//        }
//        for(int i = 0;i<nums.length;i++){
//         int val = nums[i];
//             while(val!=0){
//             Esum = Esum + val%10;
//             val = val/10;
//             }
//        }
//        int sub = Math.abs(sum - Esum);
//        return sub;
//     }
// }

class Solution {
    public int differenceOfSum(int[] nums) {
        int Esum = 0;
        int sum = 0;
        for(int num : nums){
            sum = sum + num;
            int temp = num;
            while(temp > 0){
                Esum = Esum + temp%10;
                temp = temp/10;
            }
        }
        return Math.abs(Esum - sum);
    }
}