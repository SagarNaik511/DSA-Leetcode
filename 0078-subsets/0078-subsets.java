// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//       List<List<Integer>> ans = new ArrayList<>();
//       int n = nums.length;
//       int subsets = 1 << n;

//       for(int num = 0; num < subsets; num++){
//         List<Integer> list = new ArrayList<>();
//         for(int i = 0; i<n;i++){
//             if((num & (1<<i)) != 0){
//             list.add(nums[i]);
//             }
//         }
//         ans.add(list);
//         }
//         return ans;
//       }  
//     }

//Backtracking
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }
    public void backtrack(int index, int[] nums,List<Integer> current,List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtrack(index + 1,nums,current,result);
        current.remove(current.size() - 1);
        backtrack(index + 1,nums,current,result);
    }
}