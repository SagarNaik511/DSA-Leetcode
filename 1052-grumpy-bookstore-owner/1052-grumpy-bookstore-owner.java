// class Solution {
//     public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//       int num = 0;
//       int[] arr = new int[customers.length];
//       for(int i=0;i<customers.length;i++){
//         if(grumpy[i] == 0){
//             num = num + customers[i];
//         }
//       }
//        for(int i=0;i<customers.length;i++){
//         if(grumpy[i] == 1){
//             arr[i] = customers[i];
//         }
//       }

//      int window = 0;
//      int maxCus = 0;
//      int left = 0;

//      for(int right = 0; right<arr.length; right++){
//       window = window + arr[right];
//       if(right - left + 1 == minutes){
//         maxCus = Math.max(maxCus, window);
//         window = window - arr[left];
//         left++;
//       }
//      } 
//      return maxCus + num;
//     }
// }

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int happy = 0;
        for(int i=0;i<n;i++){
            if(grumpy[i] == 0){
                happy = happy + customers[i];
            }
        }
        int window = 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i] == 1){
                window = window + customers[i];
            }
        }
        int max = window;
        for(int right = minutes; right < n; right++){
            if(grumpy[right]==1){
                window = window + customers[right];
            }
            int left = right - minutes;
            if(grumpy[left]==1){
                window = window - customers[left];
            }
            max = Math.max(max, window);
        }
        return max + happy;
    }
}