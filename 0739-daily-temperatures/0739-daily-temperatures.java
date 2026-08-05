// O(n^2)
// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int[] answer = new int[temperatures.length];
//         for(int i = 0;i<temperatures.length;i++){
//            for(int j = i+1;j<temperatures.length;j++){
//              if(temperatures[i] < temperatures[j]){
//                 answer[i] = j - i;
//                 break;
//             }
//            }
//         }
//         return answer;
//     }
// }

 class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i = n - 1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        } 
        return ans;
    }
 }