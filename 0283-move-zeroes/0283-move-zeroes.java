class Solution {
    public void moveZeroes(int[] nums) {
      List<Integer> ans = new ArrayList<>();
      for(int i = 0;i<nums.length;i++){
        if(nums[i] != 0){
           ans.add(nums[i]); 
        }
      }
      while(ans.size() < nums.length){
        ans.add(0);
      }
      
      for(int i=0;i<ans.size();i++){
        nums[i] = ans.get(i);
      }
    }
}