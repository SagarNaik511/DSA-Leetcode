// Recursion O(2^n) O(n)
// class Solution {
//     public int fib(int n) {
//         if(n <= 1){
//             return n;
//         }else{
//             return fib(n-1)+fib(n-2);
//         }
//     }
// }

//Dynamic Programming O(n) O(n)
// class Solution {
//     public int fib(int n) {
//         if(n <= 1){
//             return n;
//         }
//         int[] dp = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;

//         for(int i = 2; i<=n; i++){
//            dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
// }

// Optimal Solution O(n) O(1)
 class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;

        for(int i = 2; i<=n; i++){
            int current = prev2 + prev1;

            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
 }